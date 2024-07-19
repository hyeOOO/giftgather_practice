package study.mongoDB.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.user.entity.UserSession;

public interface UserSessionRepository extends JpaRepository<UserSession, Long> {
}
