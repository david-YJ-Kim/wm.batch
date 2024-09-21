package com.abs.wfs.batch.activator;

import com.abs.wfs.batch.data.ApSharedVariable;
import com.abs.wfs.batch.service.BatchInvokeScheduler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class ApStartedActivator implements ApplicationRunner {

    @Autowired
    private Environment env;


    @Autowired
    BatchInvokeScheduler batchInvokeScheduler;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        this.initializeSharedVariables();

        ScheduledExecutorService mainThread =  ApSharedVariable.getInstance().getApExecutorService();
        batchInvokeScheduler.startSchedule(mainThread, TimeUnit.SECONDS, 30L);

        log.info("Complete Initialization.");
    }

    private void initializeSharedVariables(){

        // Shared Variable 초기화
        ApSharedVariable.createInstance(env);
    }
}
