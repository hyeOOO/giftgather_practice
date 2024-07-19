package study.mongoDB.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mongoDB.dto.ProjectDto;
import study.mongoDB.dto.ProjectOverallDto;
import study.mongoDB.service.ProjectService;
import study.mongoDB.service.ProjectOverallService;

import java.util.List;


@RestController
public class ProjectController {
    private final ProjectService projectService;
    private final ProjectOverallService projectOverallService;

    public ProjectController(ProjectService projectService, ProjectOverallService projectOverallService) {
        this.projectService = projectService;
        this.projectOverallService = projectOverallService;
    }

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
