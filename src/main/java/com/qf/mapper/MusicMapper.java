package com.qf.mapper;

import com.qf.pojo.Music;

import java.util.List;

public interface MusicMapper {

    List<Music> selectAll();

    int deleteByPrimaryKey(Integer mid);

    int insert(Music record);

    int insertSelective(Music record);

    Music selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Music record);

    int updateByPrimaryKey(Music record);
}