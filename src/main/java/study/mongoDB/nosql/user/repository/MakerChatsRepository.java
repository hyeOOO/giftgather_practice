package study.mongoDB.nosql.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import study.mongoDB.nosql.user.entity.MakerChats;

public interface MakerChatsRepository extends MongoRepository<MakerChats, String> {
}
