package com.wjj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author :wjj
 * @date : ${DATE}
 * @Description :
 */
@SpringBootApplication
@MapperScan("com.wjj.mapper")
public class SpringBootDataApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataApplication.class,args);
    }
}