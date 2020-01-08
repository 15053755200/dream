package com.ming.dream.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.ming.dream.bean.PageInfo;
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
    public PageInfo selectUser(){
        //pageNum:表示第几页  pageSize:表示一页展示的数据
        PageHelper.startPage(0,3);
        List<UserEntity> userEntities = userService.queryUserList();
        //将查询到的数据封装到PageInfo对象
        PageInfo<UserEntity> pageInfo = new PageInfo<>();
        pageInfo.setList(userEntities);
        return pageInfo;
    }

}
