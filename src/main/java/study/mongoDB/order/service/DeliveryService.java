package study.mongoDB.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.order.entity.Delivery;
import study.mongoDB.order.repository.DeliveryRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class DeliveryService {

    private final DeliveryRepository deliveryRepository;

    public List<Delivery> getDeliveryList() {
        return deliveryRepository.findAll();
    }
}
