package study.mongoDB.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.order.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
