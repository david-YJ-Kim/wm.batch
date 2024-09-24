package com.abs.wfs.batch.dao.mybatis.batchJob.vo;


import lombok.Data;

@Data
public class BatchJobInvokeQueryDto {

    String jobId;
    String jobTyp;
    String jobDesc;

    String invokeUnit;
    Integer invokeVal;
}
