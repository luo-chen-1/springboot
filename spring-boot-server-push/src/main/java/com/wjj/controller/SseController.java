package com.wjj.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
import java.util.Date;
import java.io.IOException;


/**
 * @author :wjj
 * @date : 2023/4/17
 * @Description :
 */

@Controller
@Slf4j
public class SseController {
    

    @RequestMapping(value = "/sse/msg",method = RequestMethod.GET,produces = "text/event-stream;charset=UTF-8")
    @Scheduled(fixedDelay = 5000)
    public ResponseBodyEmitter pushMsg(){
//      创建事件
        final SseEmitter emitter = new SseEmitter(0L);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        log.info("emitter push msg ...");

        Date currentDate = new Date();
        String msg =  "hello msg " + currentDate;
        try {
            emitter.send(msg, MediaType.TEXT_EVENT_STREAM);
            System.out.println("msg"+msg);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
       return emitter;
    }

}
