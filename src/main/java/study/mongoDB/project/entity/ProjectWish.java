package study.mongoDB.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;

@Entity
@Table(name = "project_wishes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectWish {
    @Id
    @Column(name = "wish_id")
    private String wishId;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "project_id")
    private String projectId;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;
}
