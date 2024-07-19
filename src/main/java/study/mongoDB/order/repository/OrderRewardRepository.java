package study.mongoDB.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.mongoDB.order.entity.OrderReward;

public interface OrderRewardRepository extends JpaRepository<OrderReward, Long> {
}
