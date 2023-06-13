package com.wjj.config;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :
 */
@RestController
@Profile("test")
public class MyConfig_test implements DBConfig{

    @Override
    public String configure() {
        return "test 配置";
    }
}
