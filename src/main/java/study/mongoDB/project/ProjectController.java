package study.mongoDB.project;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.mongoDB.project.entity.Category;
import study.mongoDB.project.entity.Project;
import study.mongoDB.project.entity.ProjectReward;
import study.mongoDB.project.entity.ProjectWish;
import study.mongoDB.project.service.CategoryService;
import study.mongoDB.project.service.ProjectRewardService;
import study.mongoDB.project.service.ProjectService;
import study.mongoDB.project.service.ProjectWishService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProjectController {

    private final CategoryService categoryService;

    private final ProjectService projectService;

    private final ProjectRewardService projectRewardService;

    private final ProjectWishService projectWishService;

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
}
