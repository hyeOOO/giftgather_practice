package study.mongoDB.order;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mongoDB.order.entity.*;
import study.mongoDB.order.service.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class orderController {

    private final DeliveryService deliveryService;

    private final OrderRewardService orderRewardService;

    private final PaymentService paymentService;

    private final ProjectOrderService projectOrderService;

    private final RefundService refundService;

    //배송리스트
    @GetMapping("/order/deliveryList")
    public ResponseEntity<List<Delivery>> getDeliveryList() {
        List<Delivery> deliveryList = deliveryService.getDeliveryList();
        return new ResponseEntity<>(deliveryList, HttpStatus.OK);
    }

    //주문상품리스트
    @GetMapping("/order/orderRewardList")
    public ResponseEntity<List<OrderReward>> getOrderRewardList() {
        List<OrderReward> orderRewardList = orderRewardService.getOrderRewardList();
        return new ResponseEntity<>(orderRewardList, HttpStatus.OK);
    }

    //결제리스트
    @GetMapping("/order/paymentList")
    public ResponseEntity<List<Payment>> getPaymentList() {
        List<Payment> paymentList = paymentService.getPaymentList();
        return new ResponseEntity<>(paymentList, HttpStatus.OK);
    }

    //프로젝트주문리스트
    @GetMapping("/order/projectOrderList")
    public ResponseEntity<List<ProjectOrder>> getProjectOrderList() {
        List<ProjectOrder> projectOrderList = projectOrderService.getProjectOrderList();
        return new ResponseEntity<>(projectOrderList, HttpStatus.OK);
    }

    //환불리스트
    @GetMapping("/order/refundList")
    public ResponseEntity<List<Refund>> getRefundList() {
        List<Refund> refundList = refundService.getRefundList();
        return new ResponseEntity<>(refundList, HttpStatus.OK);
    }
}
