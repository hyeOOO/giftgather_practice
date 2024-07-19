package study.mongoDB.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.order.entity.Refund;

public interface RefundRepository extends JpaRepository<Refund, Long> {
}
