package com.wjj;

import com.wjj.event.MyEvent;
import com.wjj.event.MyListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author :wjj
 * @date : ${DATE}
 * @Description :
 */
@SpringBootApplication
@ServletComponentScan
public class SpringBootLaunchApplication {
    public static void main(String[] args) {
//        SpringApplication.run(SpringBootLaunchApplication.class,args);
//ConfigurableApplicationContext上下文
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootLaunchApplication.class, args);
//        装载 MyListener1 监听
        context.addApplicationListener(new MyListener1());
//        发布事件
        context.publishEvent(new MyEvent("测试事件"));
    }
}