package com.qf.service;

import com.qf.pojo.Music;

import java.util.List;

public interface MusicService {

    //全查
    List<Music> findallmusic();

    //主键查询
    Music findbymid(int mid);

}
