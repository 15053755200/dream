package com.ming.dream.controller;

import com.ming.dream.enity.UserEntity;
import com.ming.dream.dao.UserDao;
import com.ming.dream.serviice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : Ming
 * @Date : 2020/1/8 15:56
 * @Version 1.0
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/selectUser")
    public String selectUser(){
        List<UserEntity> userEntities = userService.queryUserList();
        for (UserEntity user : userEntities) {
            System.out.println(user);
        }
        return "select success == SpringBoot 2.X整合Mybatis成功！";
    }

}
