package com.qf.service.impl;

import com.qf.mapper.MusicMapper;
import com.qf.pojo.Music;
import com.qf.service.MusicService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    @Resource
    private MusicMapper musicMapper;

    @Override
    public List<Music> findallmusic() {
        return musicMapper.selectAll();
    }

    @Override
    public Music findbymid(int mid) {
        return musicMapper.selectByPrimaryKey(mid);
    }
}
