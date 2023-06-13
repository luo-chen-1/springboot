package com.wjj.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */
@Slf4j
@Component
public class MyListener2 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源 %s",MyListener2.class.getName(),event.getSource()));
    }

}
