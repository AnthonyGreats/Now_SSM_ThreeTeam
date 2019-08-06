package com.qf.mapper;

import com.qf.pojo.Therapy;

import java.util.List;

public interface TherapyMapper {

    List<Therapy> selectAll();

    int deleteByPrimaryKey(Integer theid);

    int insert(Therapy record);

    int insertSelective(Therapy record);

    Therapy selectByPrimaryKey(Integer theid);

    int updateByPrimaryKeySelective(Therapy record);

    int updateByPrimaryKey(Therapy record);
}