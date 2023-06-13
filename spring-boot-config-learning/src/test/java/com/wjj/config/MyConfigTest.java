package com.wjj.config;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :
 */

@SpringBootTest
class MyConfigTest {

    @Resource
    private MyConfig myConfig;

    @Test
    void testMyConfig(){
        myConfig.myService().sayHello();
    }
}