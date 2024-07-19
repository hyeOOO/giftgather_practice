package study.mongoDB.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.project.entity.Project;
import study.mongoDB.project.entity.ProjectReward;
import study.mongoDB.project.repository.ProjectRewardRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectRewardService {

    private final ProjectRewardRepository projectRewardRepository;

    public List<ProjectReward> getProjectRewardList() {
        return projectRewardRepository.findAll();
    }
}
