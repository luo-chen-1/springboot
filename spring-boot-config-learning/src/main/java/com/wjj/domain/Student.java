package com.wjj.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.swing.*;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :把Student 类的实例作为 Bean注入到Spring 容器中
 * @Component :
 */
@Component//被spring容器注入
public class Student {

    private Integer id;

    @Value("${person.name}")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
