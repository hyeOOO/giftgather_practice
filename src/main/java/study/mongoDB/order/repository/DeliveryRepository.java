package study.mongoDB.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.order.entity.Delivery;

public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
}
