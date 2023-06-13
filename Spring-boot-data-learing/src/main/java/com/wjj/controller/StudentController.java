package com.wjj.controller;


import com.wjj.domain.Clazz;
import com.wjj.domain.Student1;
import com.wjj.mapper.ClazzMapper;
import com.wjj.mapper.StudentMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class StudentController {


    @Resource
    private StudentMapper studentMapper;


    @Resource
    private ClazzMapper clazzMapper;

    @RequestMapping("/test")
    @ResponseBody
    public Student1 test(){
        Student1 student = studentMapper.getAllByStudentId(1001);
        Clazz clazz = clazzMapper.selectOneToMany(student.getClazz().getClazzId());
        student.getClazz().setStudents(clazz.getStudents());
        return student;
    }
}
