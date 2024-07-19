package study.mongoDB.nosql.user.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "maker_chats")
public class MakerChats {
    @Id
    private String id;
    private int makerId;
    private int userId;
    private List<Message> messages;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Message {
        private int senderId;
        private String message;
        private String timestamp;
    }
}