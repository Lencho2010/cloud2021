package com.lencho.springcloud.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * @Package: com.lencho.springcloud.listener
 * @ClassName: MyServletRequestListener
 * @Author: Lencho
 * @CreateTime: 2021/7/29 13:26
 * @Description:
 */
public class MyServletRequestListener implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("销毁seveletRequest");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("创建seveletRequest");
    }
}
