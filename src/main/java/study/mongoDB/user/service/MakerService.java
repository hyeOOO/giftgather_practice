package study.mongoDB.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.user.entity.Maker;
import study.mongoDB.user.repository.MakerRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MakerService {

    private final MakerRepository makerRepository;

    public List<Maker> getMakerList() {
        return makerRepository.findAll();
    }
}
