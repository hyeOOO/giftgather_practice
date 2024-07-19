package study.mongoDB.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.order.entity.Payment;
import study.mongoDB.order.repository.PaymentRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public List<Payment> getPaymentList() {
        return paymentRepository.findAll();
    }
}
