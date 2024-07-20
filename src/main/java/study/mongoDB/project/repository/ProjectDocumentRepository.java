package study.mongoDB.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.project.entity.Category;
import study.mongoDB.project.entity.ProjectDocument;

public interface ProjectDocumentRepository extends JpaRepository<ProjectDocument, Long> {
}
