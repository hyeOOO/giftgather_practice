package study.mongoDB.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import study.mongoDB.dto.ProjectDto;
//import study.mongoDB.dto.ProjectOverallDto;
//import study.mongoDB.service.ProjectService;
//import study.mongoDB.service.ProjectOverallService;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class ProjectController {
//    private final ProjectService projectService;
//    private final ProjectOverallService projectOverallService;

    @GetMapping("auth/success")
    public String authSuccess(@RequestParam String token) {
        return "JWT Token: " + token;
    }

    @GetMapping("/api/hello")
    public ResponseEntity<Map<String, String>> hello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "react 테스트");
        return ResponseEntity.ok(response);
    }
//    @GetMapping("/list")
//    public ResponseEntity<List<ProjectDto>> getListOfProject(){
//        List<ProjectDto> projectList = projectService.getProjectList();
//        return new ResponseEntity<>(projectList, HttpStatus.OK);
//    }
//
//    @GetMapping("/list/overall")
//    public ResponseEntity<List<ProjectOverallDto>> getListOverallProject(){
//        List<ProjectOverallDto> projectOverallList = projectOverallService.getProjectOverallList();
//        return new ResponseEntity<>(projectOverallList, HttpStatus.OK);
//    }
}
