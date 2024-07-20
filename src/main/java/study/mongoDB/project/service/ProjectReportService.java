package study.mongoDB.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.project.entity.ProjectReport;
import study.mongoDB.project.repository.ProjectReportRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectReportService {

    private final ProjectReportRepository projectReportRepository;

    public List<ProjectReport> getProjectReportList() {
        return projectReportRepository.findAll();
    }
}
