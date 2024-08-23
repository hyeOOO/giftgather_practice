//package study.mongoDB.dto;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.Field;
//import org.springframework.data.mongodb.core.mapping.FieldType;
//
//import java.util.List;
//
//@Document(collection = "project_info")
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class ProjectDto {
//    @Id
//    @Field(value = "_id", targetType = FieldType.OBJECT_ID)
//    private String id;
//
//    private String projectId;
//    private String title;
//    private String description;
//    private List<Media> media;
//    private List<String> tags;
//    private String createdBy;
//    @CreatedDate
//    private String createdAt;
//    @LastModifiedDate
//    private String updatedAt;
//
//    @Data
//    public static class Media {
//        private String type;
//        private String url;
//    }
//}
