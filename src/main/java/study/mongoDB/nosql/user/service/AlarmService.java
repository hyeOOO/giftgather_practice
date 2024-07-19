package study.mongoDB.nosql.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.nosql.user.entity.Alarm;
import study.mongoDB.nosql.user.entity.MakerChats;
import study.mongoDB.nosql.user.repository.AlarmRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class AlarmService {

    private final AlarmRepository alarmRepository;

    public List<Alarm> getAlarmList() {
        return alarmRepository.findAll();
    }
}
