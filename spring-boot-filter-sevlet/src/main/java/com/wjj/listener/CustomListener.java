package com.wjj.listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionListener;
import lombok.Data;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

/**
 * @author :wjj
 * @date : 2023/3/27
 * @Description :
 */
@Log4j2
@WebListener
public class CustomListener implements ServletContextListener, ServletRequestListener, ServletRequestAttributeListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("context----------------------------- 初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("context------------------------------ 销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("request---------------------------------- 初始化");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("request----------------------------------- 销毁");
    }


    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("attributeAdded----------------------------------- 添加");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("attributeRemoved----------------------------------- 销毁");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("attributeReplaced----------------------------------- 置换");
    }
}
