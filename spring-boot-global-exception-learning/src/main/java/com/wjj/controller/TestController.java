package com.wjj.controller;

import com.wjj.domain.Article;
import com.wjj.service.ExceptionService;
import com.wjj.util.AjaxResponse;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: TestController
 * @Author: lsc
 * @Date: 2023/03/28/14:56
 */
@RestController
@RequestMapping("api")
public class TestController {
    @Resource
    private ExceptionService exceptionService;
    @GetMapping("/articles/{id}")
//    @CheckAuth(value = "Admin123")
    public AjaxResponse getArticle(@PathVariable("id") int id){
        return  AjaxResponse.success(exceptionService.getArticle(id));
    }
    @PostMapping("/articles")
    public AjaxResponse saveArticle(@Valid @RequestBody Article article){
        return AjaxResponse.success(article);
    }
}
