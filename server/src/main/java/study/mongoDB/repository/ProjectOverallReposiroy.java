package study.mongoDB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.mongoDB.dto.ProjectOverallDto;

@Repository
public interface ProjectOverallReposiroy extends JpaRepository<ProjectOverallDto, Long> {
}
