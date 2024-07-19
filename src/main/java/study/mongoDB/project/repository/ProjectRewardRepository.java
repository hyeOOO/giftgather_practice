package study.mongoDB.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.project.entity.ProjectReward;

public interface ProjectRewardRepository extends JpaRepository<ProjectReward, Long> {
}
