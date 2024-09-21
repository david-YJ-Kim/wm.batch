package com.abs.wfs.batch.service;

import com.abs.wfs.batch.dao.mybatis.batchJob.service.BatchJobInvokeQueryService;
import com.abs.wfs.batch.dao.mybatis.batchJob.vo.BatchJobInvokeQueryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ScheduleJobService {


    @Autowired
    BatchJobInvokeQueryService batchJobInvokeQueryService;


    /**
     * Job Definition for test.
     * @param jobType
     */
    public void jobTypeOne(String jobType){
        BatchJobInvokeQueryDto dto = this.batchJobInvokeQueryService.batchJobInvokeQuery();
        log.info("Query for invoke target job item {}", dto);
    }
}
