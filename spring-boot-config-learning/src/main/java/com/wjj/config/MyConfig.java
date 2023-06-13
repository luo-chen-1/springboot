package com.wjj.config;

import com.wjj.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author :wjj
 * @date : 2023/3/14
 * @Description :使用 @Configuration  编写自定义配置类
 */

@Configuration
public class MyConfig {

//    将该方法的返回值，作为一个Bean ，添加到Spring 容器中,该Bean的id就是方法名

    /*
    *
     */

    @Bean//返回值标注成bean
    public MyService myService(){
        return new MyService();
    }


}
