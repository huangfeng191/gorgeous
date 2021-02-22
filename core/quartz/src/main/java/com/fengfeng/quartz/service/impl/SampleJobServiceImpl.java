package com.fengfeng.quartz.service.impl;

import com.fengfeng.quartz.service.SampleJobService;
import org.springframework.stereotype.Service;

@Service
public class SampleJobServiceImpl implements SampleJobService {
    @Override
    public void print() {
        System.out.println("I'm is a job ");
    }
}
