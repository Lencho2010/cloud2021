package com.lencho.springcloud.listener;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @Package: com.lencho.springcloud.listener
 * @ClassName: MyHttpSessionListener
 * @Author: Lencho
 * @CreateTime: 2021/7/29 13:18
 * @Description:
 */
@Slf4j
public class MyHttpSessionListener implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("创建session");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("销毁session");
    }
}
