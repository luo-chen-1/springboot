package com.wjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author :wjj
 * @date : ${DATE}
 * @Description :
 */
//开启定时任务
@EnableScheduling
@SpringBootApplication
public class SpringBootServerPushApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootServerPushApplication.class,args);
    }
}