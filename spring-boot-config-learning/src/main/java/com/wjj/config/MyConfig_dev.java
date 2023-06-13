package com.wjj.config;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :
 */
@RestController
@Profile("dev")
public class MyConfig_dev implements DBConfig{

    @Override
    public String configure() {
        return "Dev 配置";
    }
}
