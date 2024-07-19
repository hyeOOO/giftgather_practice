package study.mongoDB.nosql.user.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "alarm")
public class Alarm {
    @Id
    private String id;
    private String userId;
    private String type;
    private String projectId;
    private String message;
    private String timestamp;
    private boolean read;
}