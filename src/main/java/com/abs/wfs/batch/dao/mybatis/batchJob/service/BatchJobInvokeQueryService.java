package com.abs.wfs.batch.dao.mybatis.batchJob.service;


import com.abs.wfs.batch.dao.mybatis.batchJob.mapper.BatchJobInvokeMapper;
import com.abs.wfs.batch.dao.mybatis.batchJob.vo.BatchJobInvokeQueryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BatchJobInvokeQueryService {


    @Autowired
    BatchJobInvokeMapper batchJobInvokeMapper;


    public BatchJobInvokeQueryDto batchJobInvokeQuery(){
        return this.batchJobInvokeMapper.batchJobInvokeQuery();
    }
}
