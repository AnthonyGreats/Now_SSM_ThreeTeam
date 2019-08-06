package com.qf.mapper;

import com.qf.pojo.Groundphoto;


public interface GroundphotoMapper {

    Groundphoto selectAllGp();

    int deleteByPrimaryKey(Integer gid);

    int insert(Groundphoto record);

    int insertSelective(Groundphoto record);

    Groundphoto selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Groundphoto record);

    int updateByPrimaryKey(Groundphoto record);
}