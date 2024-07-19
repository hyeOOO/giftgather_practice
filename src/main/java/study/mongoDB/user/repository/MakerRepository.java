package study.mongoDB.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.user.entity.Maker;
import study.mongoDB.user.entity.User;

public interface MakerRepository extends JpaRepository<Maker, Long> {
}
