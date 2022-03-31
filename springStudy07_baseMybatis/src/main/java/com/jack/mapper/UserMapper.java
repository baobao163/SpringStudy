package com.jack.mapper;

import com.jack.model.User;

import java.util.List;

/**
 * @author 包先铭
 * @version 1.0
 * @date 2022/3/31
 */
public interface UserMapper {
    public List<User> selectUser();
}
