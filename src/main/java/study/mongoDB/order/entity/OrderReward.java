package study.mongoDB.order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "order_rewards")
public class OrderReward {
    @Id
    @Column(name = "order_reward_id")
    private String orderRewardId;

    @Column(name = "order_id")
    private String orderId;

    @Column(name = "reward_id")
    private String rewardId;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;
}
