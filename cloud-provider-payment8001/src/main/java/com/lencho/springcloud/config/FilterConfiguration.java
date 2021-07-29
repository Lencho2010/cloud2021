package com.lencho.springcloud.config;

import com.lencho.springcloud.filter.LoginFilter;
import com.lencho.springcloud.listener.MyHttpSessionListener;
import com.lencho.springcloud.listener.MyServletRequestListener;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Package: com.lencho.springcloud.config
 * @ClassName: FilterConfiguration
 * @Author: Lencho
 * @CreateTime: 2021/7/29 13:06
 * @Description:
 */
@Configuration
public class FilterConfiguration {

    @Bean
    public FilterRegistrationBean<LoginFilter> someFilterRegistration() {
        FilterRegistrationBean<LoginFilter> registration = new FilterRegistrationBean<>();
        registration.setFilter(new LoginFilter());
        registration.addUrlPatterns("/*");
        registration.setName("loginFilter");
        registration.setOrder(1); // 设置过滤器被调用的顺序
        return registration;
    }

    @Bean
    public ServletListenerRegistrationBean listenerRegist() {
        ServletListenerRegistrationBean srb = new ServletListenerRegistrationBean();
        srb.setListener(new MyServletRequestListener());
        System.out.println("listener");
        return srb;
    }
}
