package study.mongoDB.project;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mongoDB.project.entity.*;
import study.mongoDB.project.service.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProjectController {

    private final CategoryService categoryService;

    private final ProjectService projectService;

    private final ProjectRewardService projectRewardService;

    private final ProjectWishService projectWishService;

    private final ProjectDocumentService projectDocumentService;

    private final ProjectReportService projectReportService;

    //카테고리리스트
    @GetMapping("/project/categoryList")
    public ResponseEntity<List<Category>> getCategoryList() {
        List<Category> categoryList = categoryService.getCategoryList();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }

    //프로젝트리스트
    @GetMapping("/project/projectList")
    public ResponseEntity<List<Project>> getProjectList() {
        List<Project> projectList = projectService.getProjectList();
        return new ResponseEntity<>(projectList, HttpStatus.OK);
    }

    //프로젝트리워드리스트
    @GetMapping("/project/projectRewardList")
    public ResponseEntity<List<ProjectReward>> getProjectRewardList() {
        List<ProjectReward> projectRewardList = projectRewardService.getProjectRewardList();
        return new ResponseEntity<>(projectRewardList, HttpStatus.OK);
    }

    //프로젝트위시리스트
    @GetMapping("/project/projectWishList")
    public ResponseEntity<List<ProjectWish>> getProjectWishList() {
        List<ProjectWish> projectWishList = projectWishService.getProjectWishList();
        return new ResponseEntity<>(projectWishList, HttpStatus.OK);
    }

    //프로젝트심사서류리스트
    @GetMapping("/project/projectDocumentList")
    public ResponseEntity<List<ProjectDocument>> getProjectDocumentList() {
        List<ProjectDocument> projectDocumentList = projectDocumentService.getProjectDocumentList();
        return new ResponseEntity<>(projectDocumentList, HttpStatus.OK);
    }

    //프로젝트신고리스트
    @GetMapping("/project/projectReportList")
    public ResponseEntity<List<ProjectReport>> getProjectReportList() {
        List<ProjectReport> projectReportList = projectReportService.getProjectReportList();
        return new ResponseEntity<>(projectReportList, HttpStatus.OK);
    }
}
