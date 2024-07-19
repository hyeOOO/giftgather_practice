package study.mongoDB.user;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mongoDB.user.entity.Maker;
import study.mongoDB.user.entity.User;
import study.mongoDB.user.entity.UserSession;
import study.mongoDB.user.service.MakerService;
import study.mongoDB.user.service.UserService;
import study.mongoDB.user.service.UserSessionService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    private final UserSessionService userSessionService;

    private final MakerService makerService;

    //유저리스트
    @GetMapping("/user/userList")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> userList = userService.getUserList();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    //유저세션리스트
    @GetMapping("/user/userSessionList")
    public ResponseEntity<List<UserSession>> getAllUserSession() {
        List<UserSession> userSessionList = userSessionService.getUserSessionList();
        return new ResponseEntity<>(userSessionList, HttpStatus.OK);
    }

    //메이커리스트
    @GetMapping("/user/makerList")
    public ResponseEntity<List<Maker>> getAllMaker() {
        List<Maker> makerList = makerService.getMakerList();
        return new ResponseEntity<>(makerList, HttpStatus.OK);
    }
}
