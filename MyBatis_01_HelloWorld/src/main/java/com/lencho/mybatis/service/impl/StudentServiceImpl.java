package com.lencho.mybatis.service.impl;

import com.lencho.mybatis.dao.StudentMapper;
import com.lencho.mybatis.entites.Student;
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

    public List<Map> queryAll() {
        return studentMapper.queryAll();
    }

    @Override
    public List<Student> selectForPage1(int startIndex, int pageSize) {
        return studentMapper.selectForPage1(startIndex, pageSize);
    }

    @Override
    public List<Student> selectForPage2(Map<String, Object> map) {
        return studentMapper.selectForPage2(map);
    }

    @Override
    public Integer selectCount() {
        return studentMapper.selectCount();
    }

    @Override
    public List<Student> selectForPage4(int startIndex, int pageSize, String keywords) {
        return studentMapper.selectForPage4(startIndex, pageSize, keywords);
    }
}
