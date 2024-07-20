package study.mongoDB.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.project.entity.ProjectDocument;
import study.mongoDB.project.entity.ProjectReport;

public interface ProjectReportRepository extends JpaRepository<ProjectReport, Long> {
}
