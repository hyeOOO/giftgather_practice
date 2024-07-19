package study.mongoDB.nosql.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import study.mongoDB.nosql.dto.ProjectDto;

@Repository
public interface PracticeProjectRepository extends MongoRepository<ProjectDto, String> {
}
