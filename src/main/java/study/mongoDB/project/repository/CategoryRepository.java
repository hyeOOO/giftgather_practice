package study.mongoDB.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.project.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
