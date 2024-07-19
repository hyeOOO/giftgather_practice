package study.mongoDB.nosql.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mongoDB.nosql.dto.ProjectDto;
import study.mongoDB.nosql.dto.ProjectOverallDto;
import study.mongoDB.nosql.service.PracticeProjectService;
import study.mongoDB.nosql.service.ProjectOverallService;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class PracticeProjectController {
    private final PracticeProjectService projectService;
    private final ProjectOverallService projectOverallService;

    @GetMapping("/list")
    public ResponseEntity<List<ProjectDto>> getListOfProject(){
        List<ProjectDto> projectList = projectService.getProjectList();
        return new ResponseEntity<>(projectList, HttpStatus.OK);
    }

    @GetMapping("/list/overall")
    public ResponseEntity<List<ProjectOverallDto>> getListOverallProject(){
        List<ProjectOverallDto> projectOverallList = projectOverallService.getProjectOverallList();
        return new ResponseEntity<>(projectOverallList, HttpStatus.OK);
    }
}
