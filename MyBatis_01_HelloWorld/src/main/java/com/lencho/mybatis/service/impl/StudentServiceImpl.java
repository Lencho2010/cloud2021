package com.lencho.mybatis.service.impl;

import com.lencho.mybatis.dao.StudentMapper;
import com.lencho.mybatis.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-07-30 22:51
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    public List<Map> queryAll(){
        return studentMapper.queryAll();
    }
}
