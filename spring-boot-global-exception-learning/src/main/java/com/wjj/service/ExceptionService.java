package com.wjj.service;

import com.wjj.domain.Article;
import com.wjj.enums.CustomExceptionType;
import com.wjj.exception.CustomException;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;

/**
 * @ClassName: ExceptionService
 * @Author: lsc
 * @Date: 2023/03/28/14:53
 */
@Service
public class ExceptionService {
    public void authError(){throw  new CustomException(CustomExceptionType.UNAUTHORIZED_ERROR);}
    public Article getArticle(int id){
        if(id<=0|| id>3){
            throw new CustomException(CustomExceptionType.PARAM_ERROR);
        }
        return findArticleById(id);
    }
    private Article findArticleById(int id){
        List<Article> articles=List.of(new Article(1,"Spring从入门到精通","qwe","spring@qq.com", LocalDateTime.of(2023,3,20,12,12,12)),
                new Article(2,"SpringBoot 从入门到精通","asd","springboot@qq.com",LocalDateTime.of(2023,3,23,12,12,12)),
                new Article(3,"SpringCloud 从入门到精通","学神","springcloud@qq.com",LocalDateTime.of(2023,3,23,12,12,12)));
        return articles.stream().filter(article -> article.getId()==id).toList().get(0);

    }
//    public void systemVizError(){
//        throw new CustomException(CustomExceptionType.SYSTEM_ERROR,MsgConsts.PARAM_ERROR);
//    }
//    public void userBizError(int input){
//        if(input<0){
//            throw new CustomException(CustomExceptionType.USER_INPUT_ERROR, MsgConsts.INPUT_ERROR);
//        }
//    }
}
