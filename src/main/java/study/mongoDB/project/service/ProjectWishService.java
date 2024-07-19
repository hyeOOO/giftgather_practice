package study.mongoDB.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.mongoDB.project.entity.ProjectWish;
import study.mongoDB.project.repository.ProjectWishRepository;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectWishService {

    private final ProjectWishRepository projectWishRepository;

    public List<ProjectWish> getProjectWishList() {
        return projectWishRepository.findAll();
    }
}
