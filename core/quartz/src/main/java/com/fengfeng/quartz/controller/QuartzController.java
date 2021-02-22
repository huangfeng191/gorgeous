package com.fengfeng.quartz.controller;

import com.fengfeng.quartz.job.quartz.QuartzManager;
import com.fengfeng.quartz.job.quartz.WebJob;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/quartz")
public class QuartzController {

    @Autowired
    QuartzManager quartzManager;

    /**
     * 添加定时任务
     * @param jobName
     * @return
     */
    @GetMapping("/addJob")
    public Response addJob(String jobName){
        String cron = "0/3 * * * * ?";
        HashMap<String,String> map = new HashMap<>();
        map.put("jobName",jobName);
        quartzManager.addJob(jobName, WebJob.class,cron,map);
        return new Response("job添加成功","");
    }

    /**
     * 删除定时任务
     * @param jobName
     * @return
     */
    @GetMapping("/deleteJob")
    public Response deleteJob(String jobName){
        quartzManager.removeJob(jobName);
        return new Response("job删除成功","");
    }

    /**
     * 查询所有定时任务
     * @param jobName
     * @return
     */
    @GetMapping("/getAllJob")
    public Response getAllJob(String jobName){
        return new Response("成功获取所有job",quartzManager.getAllJob());
    }

}
