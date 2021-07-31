package com.lencho.mybatis.controller;

import com.lencho.mybatis.service.StudentService;
import com.lencho.mybatis.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author Lencho
 * @create 2021-07-30 22:53
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/queryAll")
    public List<Map> queryAll(){
        return studentService.queryAll();
    }

    @Resource
    private TestService testService;

    @GetMapping("/queryStudents")
    public List<Map> queryStudents(){
        return testService.queryStudents();
    }

    @GetMapping("/queryStudents2")
    public List<Map> queryStudents2(){
        return testService.queryStudents2();
    }
}
