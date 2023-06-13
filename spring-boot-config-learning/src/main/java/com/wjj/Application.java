package com.wjj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author :wjj
 * @date : ${DATE}
 * @Description :
 */
@SpringBootApplication
@ImportResource("classpath:bean.xml")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}