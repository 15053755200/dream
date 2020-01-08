package com.ming.dream.dao;

import com.ming.dream.enity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author : Ming
 * @Date : 2020/1/8 15:52
 * @Version 1.0
 */
@Mapper
@Repository
public interface UserDao {
    List<UserEntity> queryUserList();
}
