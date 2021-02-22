package com.fengfeng.quartz.job;

import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Configuration
@EnableScheduling
@Component
public class SchedulerListener {

    @Autowired
    public CronScheduler scheduleJobs;

    @Scheduled(cron = "0 30 11 25 11 ?")
    public void schedule() throws SchedulerException {
        scheduleJobs.scheduleJobs("0/6 * * * * ?");
    }

}