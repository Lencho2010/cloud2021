package com.lencho.mybatis.service;

import com.lencho.mybatis.comm.DataSourceName;
import com.lencho.mybatis.dao.StudentMapper;
import com.lencho.mybatis.util.DynamicSqlSession;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-07-31 9:13
 */
@Service
public class SqlSessionService {

    @Resource
    private DynamicSqlSession dynamicSqlSession;

    public List<Map> queryStus(){
        StudentMapper mapper = dynamicSqlSession.getMapper(DataSourceName.Second, StudentMapper.class);
        return mapper.queryAll();
    }
}
