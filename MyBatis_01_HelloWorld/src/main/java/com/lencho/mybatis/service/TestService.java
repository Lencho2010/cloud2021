package com.lencho.mybatis.service;

import com.lencho.mybatis.config.SqlSessionFactoryConfig;
import com.lencho.mybatis.dao.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-07-30 23:08
 */
@Service
public class TestService {

    @Resource
    SqlSessionFactory factory;

    public List<Map> queryStudents(){

        SqlSession sqlSession = factory.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        return mapper.queryAll();
    }
}
