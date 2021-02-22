package com.fengfeng.quartz.job;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleScheduler  {
    @Bean
    public JobDetail sampleJobDetail(){
        return JobBuilder.newJob(SampleJob.class)
                .withIdentity("SampleJobDetail")
                .usingJobData("name", "Hello sample job!")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger sampleJobTrigger(){
        SimpleScheduleBuilder builder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(200)
                .repeatForever();
        return TriggerBuilder.newTrigger()
                .forJob(sampleJobDetail())
                .withIdentity("sampleTrigger")
                .withSchedule(builder)
                .build();
    }

}
