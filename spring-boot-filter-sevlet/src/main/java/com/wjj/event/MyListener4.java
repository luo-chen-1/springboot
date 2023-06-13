package com.wjj.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */

@Slf4j
@Component
public class MyListener4 {

    @EventListener
    public void listener(MyEvent event){
        log.info(String.format("%s 监听到事件源 %s",MyListener4.class.getName(),event.getSource()));
    }

}
