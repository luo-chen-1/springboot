package com.wjj.mapper;

import com.wjj.domain.Teacher;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author :wjj
 * @date : 2023/3/21
 * @Description :
 */
@SpringBootTest
class TeacherMapperTest {

    @Resource
    private TeacherMapper teacherMapper;

    @Test
    void selectOneByOne() {
        Teacher teacher = teacherMapper.selectOneByOne(1);
        System.out.println(teacher);
    }


}