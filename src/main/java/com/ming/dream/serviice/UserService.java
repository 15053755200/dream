package com.ming.dream.serviice;

import com.ming.dream.enity.UserEntity;

import java.util.List;

/**
 * @Author : Ming
 * @Date : 2020/1/8 16:24
 * @Version 1.0
 */
public interface UserService {

    List<UserEntity> queryUserList();
}
