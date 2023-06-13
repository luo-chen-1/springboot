package com.wjj.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */
public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }
}
