package study.mongoDB.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.dto.ProjectDto;
import study.mongoDB.repository.ProjectRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;

    public List<ProjectDto> getProjectList(){
        return projectRepository.findAll();
    }

}
