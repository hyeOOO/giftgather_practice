package study.mongoDB.nosql.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.nosql.dto.ProjectOverallDto;
import study.mongoDB.nosql.repository.ProjectOverallReposiroy;

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
