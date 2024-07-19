package study.mongoDB.nosql.project;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mongoDB.nosql.project.entity.ProjectDetails;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class NosqlProjectController {

    private final ProjectDetailsService projectDetailsService;

    @GetMapping("/nosql/project/projectDetailsList")
    public ResponseEntity<List<ProjectDetails>> getProjectDetailsList() {
        List<ProjectDetails> projectDetailsList = projectDetailsService.getProjectDetailsList();
        return new  ResponseEntity<>(projectDetailsList, HttpStatus.OK);
    }
}
