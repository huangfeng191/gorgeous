package com.fengfeng.quartz.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

public class CronJob implements Job {

    @Override
    public void execute(JobExecutionContext context) {
        System.out.println("Cron job is running ...");
    }

}
