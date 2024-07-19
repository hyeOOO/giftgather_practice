package study.mongoDB.nosql.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.nosql.user.entity.MakerChats;
import study.mongoDB.nosql.user.repository.MakerChatsRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class MakerChatsService {

    private final MakerChatsRepository makerChatsRepository;

    public List<MakerChats> getMakerChatsList() {
        return makerChatsRepository.findAll();
    }
}
