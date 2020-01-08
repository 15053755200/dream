package com.ming.dream.serviice.impl;

import com.ming.dream.dao.UserDao;
import com.ming.dream.enity.UserEntity;
import com.ming.dream.serviice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : Ming
 * @Date : 2020/1/8 16:25
 * @Version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> queryUserList() {
        return userDao.queryUserList();
    }
}
