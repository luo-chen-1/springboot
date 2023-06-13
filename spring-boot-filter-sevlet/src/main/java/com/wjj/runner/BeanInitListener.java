package com.wjj.runner;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */
@Slf4j
@Component
public class BeanInitListener implements InitializingBean {
    static{
        log.info("类初始化静态代码块");
    }

    public BeanInitListener(){
        log.info("类初始化构造方法");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("类初始 afterPropertieSet 方法");
    }

    @PostConstruct
    void method(){
        log.info("类初始化 postConStruct 注解方法！");
    }
}
