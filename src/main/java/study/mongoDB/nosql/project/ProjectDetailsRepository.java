package study.mongoDB.nosql.project;

import org.springframework.data.mongodb.repository.MongoRepository;
import study.mongoDB.nosql.project.entity.ProjectDetails;

public interface ProjectDetailsRepository extends MongoRepository<ProjectDetails, String> {
}
