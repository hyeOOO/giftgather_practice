package study.mongoDB.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.order.entity.ProjectOrder;

public interface ProjectOrderRepository extends JpaRepository<ProjectOrder, Long> {
}
