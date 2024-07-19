package study.mongoDB.nosql.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import study.mongoDB.nosql.user.entity.UsersInfo;

public interface UsersInfoRepository extends MongoRepository<UsersInfo, String> {
}
