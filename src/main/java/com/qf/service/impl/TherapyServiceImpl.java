package com.qf.service.impl;

import com.qf.mapper.TherapyMapper;
import com.qf.pojo.Therapy;
import com.qf.service.TherapyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TherapyServiceImpl implements TherapyService {

    @Resource
    private TherapyMapper therapyMapper;

    @Override
    public List<Therapy> findAll() {
        return therapyMapper.selectAll();
    }
}
