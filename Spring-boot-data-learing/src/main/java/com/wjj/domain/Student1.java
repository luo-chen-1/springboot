package com.wjj.domain;

import lombok.*;

import java.time.LocalDate;
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
public class Student1 {

    private  Integer studentId;

    private Integer clazzId;

    private  String studentName;

    private String hometown;

    private LocalDate birthday;

    private Clazz clazz;

    private List<Course> courses;


}
