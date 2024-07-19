package study.mongoDB.nosql.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.nosql.project.entity.ProjectDetails;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectDetailsService {

    private final ProjectDetailsRepository projectDetailsRepository;

    public List<ProjectDetails> getProjectDetailsList() {
        return projectDetailsRepository.findAll();
    }
}
