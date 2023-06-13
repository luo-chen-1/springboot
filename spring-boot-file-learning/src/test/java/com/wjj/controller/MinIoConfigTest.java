package com.wjj.controller;

import io.minio.ObjectWriteResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author :wjj
 * @date : 2023/4/10
 * @Description :
 */
@SpringBootTest
@Slf4j
class MinIoConfigTest {

    @Resource
    private MinIoConfig minIoConfig;

    @Test
    void makeBucket() throws Exception{
        minIoConfig.makeBucket("hello");
    }

    @Test
    void uploadObject() throws Exception{
        ObjectWriteResponse response = minIoConfig.uploadObject("hello","img/9527.jpg","D:\\图片\\动漫图片\\R-C.jpg");
    }

    @Test
    void putObject() throws Exception{
    }

    @Test
    void removeObject() throws Exception{
        minIoConfig.removeObject("hello","img/9527.jpg");
    }
}