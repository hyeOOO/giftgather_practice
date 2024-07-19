package study.mongoDB.nosql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.mongoDB.nosql.dto.ProjectOverallDto;

@Repository
public interface ProjectOverallReposiroy extends JpaRepository<ProjectOverallDto, Long> {
}
