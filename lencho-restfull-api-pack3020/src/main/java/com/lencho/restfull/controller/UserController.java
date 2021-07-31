package com.lencho.restfull.controller;

import com.lencho.restfull.Entities.User;
import com.lencho.restfull.anno.ResponseResult;
import com.lencho.restfull.comm.Result;
import com.lencho.restfull.comm.ResultResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lencho
 * @create 2021-07-31 10:10
 */
@RestController
@RequestMapping("/user")
@ResponseResult
public class UserController {

    @GetMapping("/list")
    public User getUserInfo() {
        return new User("21", "李拴蛋", "456");
    }

    @GetMapping("/list2")
    public Result getUserInfo2() {
        User user = new User("21", "李拴蛋", "456");
        return ResultResponse.success(user);
    }
}
