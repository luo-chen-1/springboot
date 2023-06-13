package com.wjj.repository;

import com.wjj.domain.Article;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author :wjj
 * @date : 2023/3/20
 * @Description :
 */
public interface ArticleRepository  extends JpaRepository<Article,Integer> {


    @Query("SELECT b FROM t_article b")
    List<Article> getArticlePage(Pageable pageable);


}
