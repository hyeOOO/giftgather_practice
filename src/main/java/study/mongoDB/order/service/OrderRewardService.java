package study.mongoDB.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.order.entity.OrderReward;
import study.mongoDB.order.repository.OrderRewardRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderRewardService {

    private final OrderRewardRepository orderRewardRepository;

    public List<OrderReward> getOrderRewardList() {
        return orderRewardRepository.findAll();
    }
}
