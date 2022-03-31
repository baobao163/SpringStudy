package com.jack.mapper;

import com.jack.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author 包先铭
 * @version 1.0
 * @date 2022/3/31
 */
public class UserMapperImpl implements UserMapper {
    //sqlSession不用我们自己创建了，Spring来管理
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    //获取所有数据列表
    @Override
    public List<User> selectAllUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectAllUser();
    }

    //根据id获取单一数据
    @Override
    public User getOneUser(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.getOneUser(id);
    }
}
