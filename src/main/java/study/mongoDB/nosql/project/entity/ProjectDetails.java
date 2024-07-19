package study.mongoDB.nosql.project.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "project_details")
public class ProjectDetails {
    @Id
    private String id;
    private int projectId;
    private String story;
    private IntroductionMedia introductionMedia;
    private List<Update> updates;
    private int wishes;
    private int backers;
    private List<DocumentItem> documents;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class IntroductionMedia {
        private String type;
        private String url;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Update {
        private String title;
        private String content;
        private List<String> images;
        private String createdAt;
        private String updatedAt;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DocumentItem {
        private String name;
        private String url;
    }
}