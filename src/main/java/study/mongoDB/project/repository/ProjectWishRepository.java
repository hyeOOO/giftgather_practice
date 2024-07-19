package study.mongoDB.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.project.entity.ProjectWish;

public interface ProjectWishRepository extends JpaRepository<ProjectWish, Long> {
}
