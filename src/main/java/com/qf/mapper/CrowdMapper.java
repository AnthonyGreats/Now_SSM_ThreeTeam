package com.qf.mapper;

import com.qf.pojo.Crowd;

import java.util.List;

public interface CrowdMapper {

    List<Crowd> selectAll();

    int deleteByPrimaryKey(Integer cid);

    int insert(Crowd record);

    int insertSelective(Crowd record);

    Crowd selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Crowd record);

    int updateByPrimaryKey(Crowd record);
}