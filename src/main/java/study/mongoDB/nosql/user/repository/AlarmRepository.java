package study.mongoDB.nosql.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import study.mongoDB.nosql.user.entity.Alarm;

public interface AlarmRepository extends MongoRepository<Alarm, String> {
}
