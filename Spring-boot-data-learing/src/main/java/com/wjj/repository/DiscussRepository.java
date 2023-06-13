package com.wjj.repository;

import com.wjj.domain.Discuss;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author :wjj
 * @date : 2023/3/20
 * @Description :
 */
public interface DiscussRepository extends JpaRepository<Discuss,Integer> {


    /**
     * 查询 author 非空的 Discuss 评论集合
     * @return List<Discuss>
     */

    List<Discuss> findByAuthorNotNull();

    /**
     *
     */
    List<Discuss> findByAuthorEquals(String author);


    List<Discuss> findByAIdEquals(Integer aId);

    @Query("SELECT c FROM t_comment c WHERE c.AId=?1")
    List<Discuss> getDiscussesPage(Integer aid,Pageable pageable);


    @Query("SELECT c FROM t_comment c ")
    List<Discuss> getDiscussesByPage(Pageable pageable);


}
