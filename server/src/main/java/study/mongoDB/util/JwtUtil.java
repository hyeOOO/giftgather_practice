package study.mongoDB.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Map;

@Component
public class JwtUtil {
    private final SecretKey secretKey;
    private final int accessTokenExpirationInMs;
    private final int refreshTokenExpirationInMs;

    public JwtUtil(@Value("${jwt.secret}")String secret,
                   @Value("${jwt.access-token-expiration-minutes}")int accessTokenExpirationInMs,
                   @Value("${jwt.refresh-token-expiration-minutes}")int refreshTokenExpirationInMs) {
        this.secretKey = Keys.hmacShaKeyFor(secret.getBytes(StandardCharsets.UTF_8));
        this.accessTokenExpirationInMs = accessTokenExpirationInMs * 60 * 1000;
        this.refreshTokenExpirationInMs = refreshTokenExpirationInMs * 60 * 1000;
    }

    // Access Token 생성
    public String generateAccessToken(Map<String, Object> claims, String subject) {
        return generateToken(claims, subject, accessTokenExpirationInMs);
    }

    // Refresh Token 생성
    public String generateRefreshToken(String subject) {
        return generateToken(null, subject, refreshTokenExpirationInMs);
    }

    // jwt 최초 발급 메서드
    public String generateToken(Map<String, Object> claims, String subject, int expirationInMs) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expirationInMs))
                .signWith(secretKey, SignatureAlgorithm.HS512)
                .compact();
    }

    // claims 반환
    public Claims extractAllClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey) // 여기서도 SecretKey 사용
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public String extractUsername(String token) {
        return extractAllClaims(token).getSubject();
    }

    public boolean isTokenExpired(String token) {
        return extractAllClaims(token).getExpiration().before(new Date());
    }

    public boolean validateToken(String token, String username) {
        return (extractUsername(token).equals(username) && !isTokenExpired(token));
    }

    public Jws<Claims> getClaims(String jws) {
        return Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(jws);
    }

    public void verifySignature(String jws) {
        Jwts.parserBuilder()
                .setSigningKey(secretKey)
                .build()
                .parseClaimsJws(jws);
    }

    public Date getTokenExpiration(int expirationMinutes) {
        return new Date(System.currentTimeMillis() + (expirationMinutes * 60 * 1000L));
    }
}
