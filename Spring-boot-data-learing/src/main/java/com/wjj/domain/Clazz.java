package com.wjj.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author :wjj
 * @date : 2023/3/21
 * @Description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Clazz {

    private Integer teacherId;

    private String  clazzName;

    private Integer clazzId;

    private List<Student1> students;


}
