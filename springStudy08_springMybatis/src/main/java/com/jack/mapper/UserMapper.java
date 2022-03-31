package com.jack.mapper;

import com.jack.pojo.User;

import java.util.List;

/**
 * @author 包先铭
 * @version 1.0
 * @date 2022/3/31
 */
public interface UserMapper {
    List<User> selectAllUser();

    User getOneUser(int id);
}
