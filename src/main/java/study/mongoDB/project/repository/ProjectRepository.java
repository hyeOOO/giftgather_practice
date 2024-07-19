package study.mongoDB.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.project.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
