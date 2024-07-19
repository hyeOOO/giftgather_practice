package study.mongoDB.nosql.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mongoDB.nosql.user.entity.Alarm;
import study.mongoDB.nosql.user.entity.MakerChats;
import study.mongoDB.nosql.user.entity.UsersInfo;
import study.mongoDB.nosql.user.service.AlarmService;
import study.mongoDB.nosql.user.service.MakerChatsService;
import study.mongoDB.nosql.user.service.UsersInfoService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NosqlUserController {

    private final AlarmService alarmService;

    private final MakerChatsService makerChatsService;

    private final UsersInfoService usersInfoService;

    //알람리스트
    @GetMapping("/nosql/user/alarmList")
    public ResponseEntity<List<Alarm>> getAlarmList() {
        List<Alarm> alarmList = alarmService.getAlarmList();
        return new ResponseEntity<>(alarmList, HttpStatus.OK);
    }

    //메이커에게문의리스트
    @GetMapping("/nosql/user/makerChatsList")
    public ResponseEntity<List<MakerChats>> getMakerChatsList() {
        List<MakerChats> makerChatsList = makerChatsService.getMakerChatsList();
        return new ResponseEntity<>(makerChatsList, HttpStatus.OK);
    }

    //유저정보리스트
    @GetMapping("/nosql/user/usersInfoList")
    public ResponseEntity<List<UsersInfo>> getUsersInfoList() {
        List<UsersInfo> usersInfoList = usersInfoService.getUsersInfoList();
        return new ResponseEntity<>(usersInfoList, HttpStatus.OK);
    }
}
