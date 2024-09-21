package com.abs.wfs.batch.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class BatchInvokeScheduler {


    @Autowired
    ScheduleJobService scheduleJobService;

    /**
     *
     * @param executorService
     * @param timeUnit
     * @param interval
     */
    public void startSchedule(ScheduledExecutorService executorService, TimeUnit timeUnit, Long interval){

        log.info("Main Scheduler has been started.");
        executorService.scheduleAtFixedRate(() -> {
            this.scheduleJobService.jobTypeOne("Test");
        }, 0, interval, timeUnit);
    }
}
