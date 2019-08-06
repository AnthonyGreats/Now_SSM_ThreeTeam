package com.qf.service.impl;

import com.qf.mapper.GroundphotoMapper;
import com.qf.pojo.Groundphoto;
import com.qf.service.GroundphotoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GroundphotoServiceImpl implements GroundphotoService {

    @Resource
    private GroundphotoMapper groundphotoMapper;

    @Override
    public Groundphoto findall() {
        return groundphotoMapper.selectAllGp();
    }
}
