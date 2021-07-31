package com.lencho.mybatis.util;

import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author Lencho
 * @create 2021-07-31 9:11
 */
@Component
@Slf4j
public class DynamicSqlSession {

    @Resource
    private ApplicationContext appContext;

    public SqlSession getSqlSession(String name){
        log.info("getSqlSession - {}", name);
        if(StringUtils.isBlank(name)){
            throw new RuntimeException("name can't be empty");
        }
        SqlSessionFactory bean = appContext.getBean(name, SqlSessionFactory.class);
        return bean.openSession();
    }

    public <T> T getMapper(String sessionName, Class<T> mapperClass){
        return getSqlSession(sessionName).getMapper(mapperClass);
    }
}
