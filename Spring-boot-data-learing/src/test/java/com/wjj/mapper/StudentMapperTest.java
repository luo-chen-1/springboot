package com.wjj.mapper;

import com.wjj.domain.Student1;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author :wjj
 * @date : 2023/3/21
 * @Description :
 */
@SpringBootTest
class StudentMapperTest {

    @Resource
    private StudentMapper studentMapper;

    @Test
    void selectManyToOne() {
        Student1 student = studentMapper.selectManyToOne(1001);
        assertEquals("钱智康",student.getStudentName());
        assertEquals(1,student.getClazz().getClazzId());
        System.out.println(student);
    }

    @Test
    void batchInsert(){
        List<Student1> students = new ArrayList<>();
        for (int i = 0;i<100;i++){
            Student1 student  =Student1.builder()
                    .studentId(3000+i)
                    .clazzId(1)
                    .studentName("测试学生"+i)
                    .hometown("南京")
                    .birthday(LocalDate.of(2003,10,3))
                    .build();
            students.add(student);
        }
        int count = studentMapper.batchInsert(students);
        System.out.println(count);
    }

    @Test
    void batchUpdate() {
        List<Student1> students = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Student1 student1 = Student1.builder().studentId(3000 + i).clazzId(1).studentName("新名字" + i).hometown("苏州").build();
            students.add(student1);
        }
        int count = studentMapper.batchUpdate(students);
        System.out.println(students);
    }

    @Test
    void batchDelete() {
        List<Integer> idList = List.of(3000,3001,3002,3003);
        int count = studentMapper.batchDelete(idList);
        System.out.println(count);
    }

    @Test
    void dynamicSelect() {
        Student1 student1 = Student1.builder().hometown("州").build();
        List<Student1> student1s = studentMapper.dynamicSelect(student1);
        student1s.forEach(s -> {
            System.out.println(s.getClazzId()+","+s.getStudentName()+","+s.getHometown()+","+s.getBirthday());
        });
    }

    @Test
    void insertOneByOne() {
        Student1 student  =Student1.builder()
                .studentId(5000+1)
                .clazzId(1)
                .studentName("小王")
                .hometown("南京")
                .birthday(LocalDate.of(2003,10,3))
                .build();
        int count = studentMapper.insertOneByOne(student);
        System.out.println(count);
    }

    @Test
    void selectOne() {

        Student1 student1 = studentMapper.selectOne("江苏苏州");
        System.out.println(student1);
    }


    @Test
    void updateOne() {
        Student1 student  =Student1.builder()
                .studentId(5001)
                .clazzId(1)
                .studentName("小王")
                .hometown("江苏苏州")
                .birthday(LocalDate.of(2001,1,18))
                .build();
         studentMapper.updateOne(student);
    }


    @Test
    void deleteOne() {
        studentMapper.deleteOne(5001);

    }

    @Test
    void getAllByStudentId() {
        Student1 allByStudentId = studentMapper.getAllByStudentId(1001);
        System.out.println(allByStudentId);
    }
}