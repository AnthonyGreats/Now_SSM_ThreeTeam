package com.qf.service.impl;

import com.qf.mapper.CrowdMapper;
import com.qf.pojo.Crowd;
import com.qf.service.CrowdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CrowdServiceImpl implements CrowdService {

    @Resource
    private CrowdMapper crowdMapper;

    @Override
    public List<Crowd> findall() {
        return crowdMapper.selectAll();
    }
}
