package study.mongoDB.util;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomAuthorityUtils {

    private String adminMailAddress = "admin@gmail.com";

    private final List<GrantedAuthority> ADMIN_ROLES = AuthorityUtils.createAuthorityList("ROLE_ADMIN", "ROLE_USER", "ROLE_MAKER");
    private final List<GrantedAuthority> USER_ROLES = AuthorityUtils.createAuthorityList("ROLE_USER");
    private final List<GrantedAuthority> MAKER_ROLES = AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_MAKER");

    private final List<String> ADMIN_ROLES_STRING = List.of("ADMIN", "USER", "MAKER");
    private final List<String> USER_ROLES_STRING = List.of("USER");
    private final List<String> MAKER_ROLES_STRING = List.of("MAKER","USER");

    // 권한 정보 생성
    public List<GrantedAuthority> createAuthorities(List<String> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority("ROLE_" + role))
                .collect(Collectors.toList());
    }

    public List<String> createRoles(String email) {
        if (email.equals(adminMailAddress)) {
            return ADMIN_ROLES_STRING;
        }
        return USER_ROLES_STRING;
    }


}
