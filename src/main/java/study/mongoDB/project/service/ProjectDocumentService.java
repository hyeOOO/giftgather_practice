package study.mongoDB.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.project.entity.ProjectDocument;
import study.mongoDB.project.repository.ProjectDocumentRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectDocumentService {

    private final ProjectDocumentRepository projectDocumentRepository;

    public List<ProjectDocument> getProjectDocumentList() {
        return projectDocumentRepository.findAll();
    }
}
