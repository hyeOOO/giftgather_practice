package study.mongoDB.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;
import study.mongoDB.entity.User;
import study.mongoDB.repository.UserRepository;
import study.mongoDB.util.JwtUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
@Slf4j
public class OAuth2LoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    private final JwtUtil jwtUtil;
    private final UserRepository userRepository;

    public OAuth2LoginSuccessHandler(JwtUtil jwtUtil, UserRepository userRepository) {
        this.jwtUtil = jwtUtil;
        this.userRepository = userRepository;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();

        String registrationId = ((OAuth2AuthenticationToken) authentication).getAuthorizedClientRegistrationId();

        String email;
        String name;

        if ("naver".equals(registrationId)) {
            Map<String, Object> responseMap = (Map<String, Object>) oAuth2User.getAttribute("response");
            email = (String) responseMap.get("email");
            name = (String) responseMap.get("name");
        } else {  // 기본적으로 구글, 카카오 등
            email = oAuth2User.getAttribute("email");
            name = oAuth2User.getAttribute("name");
        }

        if (email == null) {
            // 이메일이 null인 경우 처리 (예: 로그 기록, 에러 응답 등)
            log.info("Provider = {}", registrationId);
            logger.error("Email is null for OAuth2 user");
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Email not provided by OAuth2 provider");
            return;
        } else {
            log.info("Email = {}", email);
        }

        User user = userRepository.findByEmail(email)
                .orElseGet(() -> {
                    User newUser = new User();
                    newUser.setEmail(email);
                    newUser.setName(name != null ? name : "Unknown");
                    newUser.setProvider(registrationId);
                    return userRepository.save(newUser);
                });

        Map<String, Object> claims = new HashMap<>();
        claims.put("name", user.getName());

        String token = jwtUtil.generateToken(claims, user.getEmail());
        String redirectUrl = UriComponentsBuilder.fromUriString("http://localhost:3000/auth/success")
                .queryParam("token", token)
                .build().toUriString();

        getRedirectStrategy().sendRedirect(request, response, redirectUrl);
    }
}
