package com.qf.mapper;

import com.qf.pojo.User;

public interface UserMapper {

    User selectByWeChat(String wechat);

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}