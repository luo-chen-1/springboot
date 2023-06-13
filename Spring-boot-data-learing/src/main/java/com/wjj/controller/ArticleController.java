package com.wjj.controller;

import com.wjj.domain.Article;
import com.wjj.domain.Discuss;
import com.wjj.repository.ArticleRepository;
import com.wjj.repository.DiscussRepository;
import jakarta.annotation.Resource;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author :wjj
 * @date : 2023/3/20
 * @Description :
 */
@Controller
public class ArticleController {

    @Resource
    private ArticleRepository articleRepository;
    @Resource
    private DiscussRepository discussRepository;

    @GetMapping("/article")
    public String getArticle(ModelMap map){
        Pageable pageable = PageRequest.of(0,2);
        List<Article> articlePage = articleRepository.getArticlePage(pageable);
        map.put("list",articlePage);
        return "index1.html";
    }


}
