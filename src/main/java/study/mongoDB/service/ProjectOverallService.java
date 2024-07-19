package study.mongoDB.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.dto.ProjectDto;
import study.mongoDB.dto.ProjectOverallDto;
import study.mongoDB.repository.ProjectOverallReposiroy;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectOverallService {
    private final ProjectOverallReposiroy projectOverallReposiroy;

    public List<ProjectOverallDto> getProjectOverallList(){
        return projectOverallReposiroy.findAll();
    }
}
