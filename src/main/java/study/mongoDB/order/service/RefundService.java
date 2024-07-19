package study.mongoDB.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.order.entity.Refund;
import study.mongoDB.order.repository.RefundRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class RefundService {

    private final RefundRepository refundRepository;

    public List<Refund> getRefundList() {
        return refundRepository.findAll();
    }
}
