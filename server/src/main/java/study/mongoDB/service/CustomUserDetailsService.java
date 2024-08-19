package study.mongoDB.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import study.mongoDB.entity.User;
import study.mongoDB.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + username));

        return org.springframework.security.core.userdetails.User
                .withUsername(user.getEmail())
                .password("") // OAuth2 사용자는 비밀번호가 없으므로 빈 문자열 사용
                .authorities("ROLE_USER") // 필요에 따라 권한 설정
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .build();
    }
}
