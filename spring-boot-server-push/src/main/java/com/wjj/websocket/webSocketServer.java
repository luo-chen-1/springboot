package com.wjj.websocket;

import jakarta.websocket.OnOpen;
import jakarta.websocket.Session;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author :wjj
 * @date : 2023/4/17
 * @Description : SpringBoot 服务端 WebSocket 服务类定义
 */
@Component
@ServerEndpoint(value = "/ws/info")
@Slf4j
public class webSocketServer {
    /**
     * 静态变量
     */
    private static int onlineCount = 0;

    //与某个客户端连接的会话,存放了和客户端连接对应的WebSocket 对象
    private Session session;


    public static ConcurrentHashMap<Integer,webSocketServer> map = new ConcurrentHashMap<>();
    /**
     * 连接建立成功调用方法
     */
    @OnOpen
    public void onOpen(@PathParam(value = "id")Integer id, Session session){
        this.session = session;
        log.info("连接成功");
    }

    private void sendMessage(String msg){



    }

}
