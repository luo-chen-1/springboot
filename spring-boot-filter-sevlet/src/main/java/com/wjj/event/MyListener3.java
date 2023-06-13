package com.wjj.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */
@Slf4j
public class MyListener3 implements ApplicationListener<MyEvent> {

    @Override
    public void onApplicationEvent(MyEvent event) {
        log.info(String.format("%s 监听到事件源 %s",MyListener3.class.getName(),event.getSource()));
    }

}
