package com.wjj.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :wjj
 * @date : 2023/3/20
 * @Description :
 */
//实体化表 ,组件生成
@Entity(name = "t_comment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Discuss {

    /**
     * 指定主键自增策略
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Column()
    private String author;

    private String content;

    @Column(name = "a_id")
    private Integer AId;


}
