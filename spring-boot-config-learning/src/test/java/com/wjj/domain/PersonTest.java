package com.wjj.domain;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :
 */
@SpringBootTest
public class PersonTest {

    @Resource
    private Person person;

    @Test
    void testPerson(){
        System.out.println(person);
    }
}