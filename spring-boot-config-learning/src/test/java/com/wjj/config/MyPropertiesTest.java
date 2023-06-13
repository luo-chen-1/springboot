package com.wjj.config;

import com.wjj.prop.MyProperties;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :
 */

@SpringBootTest
class MyPropertiesTest {

    @Resource
    private MyProperties myProperties;

    @Test
    void testMyProperties(){
        System.out.println(myProperties);
    }

}