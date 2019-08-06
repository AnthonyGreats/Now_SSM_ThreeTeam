package com.qf.mapper;

import com.qf.pojo.Asmr;

public interface AsmrMapper {
    int deleteByPrimaryKey(Integer asmrid);

    int insert(Asmr record);

    int insertSelective(Asmr record);

    Asmr selectByPrimaryKey(Integer asmrid);

    int updateByPrimaryKeySelective(Asmr record);

    int updateByPrimaryKey(Asmr record);
}