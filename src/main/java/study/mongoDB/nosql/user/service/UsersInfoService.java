package study.mongoDB.nosql.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.nosql.user.entity.UsersInfo;
import study.mongoDB.nosql.user.repository.UsersInfoRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UsersInfoService {

    private final UsersInfoRepository usersInfoRepository;

    public List<UsersInfo> getUsersInfoList() {
        return usersInfoRepository.findAll();
    }
}
