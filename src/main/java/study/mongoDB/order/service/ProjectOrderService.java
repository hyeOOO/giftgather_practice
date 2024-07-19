package study.mongoDB.order.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.order.entity.ProjectOrder;
import study.mongoDB.order.repository.ProjectOrderRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectOrderService {

    private final ProjectOrderRepository projectOrderRepository;

    public List<ProjectOrder> getProjectOrderList() {
        return projectOrderRepository.findAll();
    }
}
