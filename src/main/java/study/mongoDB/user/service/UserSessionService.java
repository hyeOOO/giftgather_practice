package study.mongoDB.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.user.repository.UserSessionRepository;
import study.mongoDB.user.entity.UserSession;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserSessionService {
    private final UserSessionRepository userSessionRepository;

    public List<UserSession> getUserSessionList() {
        return userSessionRepository.findAll();
    }
}
