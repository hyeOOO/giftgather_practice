package study.mongoDB.nosql.user.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users_info")
public class UsersInfo {
    @Id
    private String id;
    private String userId;
    private String supporterName;
    private String supporterBio;
    private String supporterProfileImg;
    private String makerName;
    private String makerBio;
    private String makerProfileImg;
    private String makerEmail;
    private String makerPhone;
    private String makerSnsUrl;
    private String createdAt;
    private String updatedAt;
}
