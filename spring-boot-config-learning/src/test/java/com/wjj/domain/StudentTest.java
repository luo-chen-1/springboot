package com.wjj.domain;

import jakarta.annotation.Resource;
import org.apache.tomcat.util.net.openssl.OpenSSLUtil;
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
class StudentTest {

    @Resource
    private Student student;

    @Test
    void testStudent(){
        System.out.println(student);
    }

}