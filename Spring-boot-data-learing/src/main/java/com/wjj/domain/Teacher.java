package com.wjj.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :wjj
 * @date : 2023/3/21
 * @Description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Teacher {

    private  Integer teacherId;

    private  String teacherName;

    private  String clazzId;

    private Clazz clazz;

}
