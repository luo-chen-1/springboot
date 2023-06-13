package com.wjj.repository;

import com.wjj.domain.Discuss;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author :wjj
 * @date : 2023/3/20
 * @Description :
 */
@SpringBootTest
class DiscussRepositoryTest {

    @Resource
    private  DiscussRepository discussRepository;


    /**
     * 使用 JpaRepository 内部自带的方法测试
     * 2
     */



    @Test
    void SelectComment(){
        Optional<Discuss> optional = discussRepository.findById(1);
        optional.ifPresent(System.out::println);

//        boolean present = optional.isPresent();
//        if(present){
//            Discuss discuss = optional.get();
//            System.out.println(discuss);
//        }
    }


    @Test
    void  getDiscussesByPage(){
        Pageable pageable = PageRequest.of(1,2);
        List<Discuss> list =  discussRepository.getDiscussesByPage(pageable);
        list.forEach(System.out::println);
    }



    @Test
    void findByAuthorNotNull() {

        List<Discuss> list = discussRepository.findByAuthorNotNull();
        list.forEach(System.out::println);
    }



    @Test
    void findByAuthorEquals() {
        List<Discuss> list = discussRepository.findByAuthorEquals("一只蜗牛");
        list.forEach(System.out::println);
    }

    /**
     * 根据AID进行查询
     */


    @Test
    void findByAIdEquals() {
        List<Discuss> list = discussRepository.findByAIdEquals(1);
        list.forEach(System.out::println);
    }






}