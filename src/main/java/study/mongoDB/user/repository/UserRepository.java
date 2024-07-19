package study.mongoDB.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.user.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
