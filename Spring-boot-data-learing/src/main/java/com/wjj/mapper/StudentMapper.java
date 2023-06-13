package com.wjj.mapper;

import com.wjj.domain.Student1;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author :wjj
 * @date : 2023/3/21
 * @Description :
 */
public interface StudentMapper {

    Student1 selectManyToOne(int studentId);

    //@Param是别名
    int batchInsert(@Param("students") List<Student1> students);


    int batchUpdate(@Param("students") List<Student1> students);

    int batchDelete(@Param("idList") List<Integer> idList);

    List<Student1> dynamicSelect(Student1 student1);

    int insertOneByOne(Student1 student1);

    Student1 selectOne(String hometown);

    @Update("UPDATE t_student SET clazz_id = #{clazzId},student_name = #{studentName},hometown = #{hometown},birthday = #{birthday} WHERE student_id = #{studentId}")
    void updateOne(Student1 student1);

    @Delete("DELETE FROM t_student WHERE  student_id = #{studentId}")
    void deleteOne(int studentId);

//    多表查询
    Student1 getAllByStudentId(int studentId);



}
