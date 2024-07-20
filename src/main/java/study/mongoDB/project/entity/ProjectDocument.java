package study.mongoDB.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Entity
@Table(name = "project_documents")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDocument {

    @Id
    @Column(name = "document_id")
    private String documentId;

    @Column(name = "project_id", nullable = false)
    private String projectId;

    @Column(name = "document_name", nullable = false)
    private String documentName;

    @Column(name = "document_url", nullable = false)
    private String documentUrl;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;
}