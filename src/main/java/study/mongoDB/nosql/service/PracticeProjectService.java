package study.mongoDB.nosql.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.nosql.dto.ProjectDto;
import study.mongoDB.nosql.repository.PracticeProjectRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PracticeProjectService {

    private final PracticeProjectRepository projectRepository;

    public List<ProjectDto> getProjectList(){
        return projectRepository.findAll();
    }

}
