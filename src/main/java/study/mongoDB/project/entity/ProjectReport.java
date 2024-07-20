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
@Table(name = "project_reports")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectReport {

    @Id
    @Column(name = "report_id")
    private String reportId;

    @Column(name = "project_id", nullable = false)
    private String projectId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "report_reason")
    private String reportReason;

    @Column(name = "report_status")
    private String reportStatus;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;
}
