package com.abs.wfs.batch.dao.mybatis.batchJob.vo;


import lombok.Data;

@Data
public class BatchJobInvokeQueryDto {

    String jobId;
    String jobTyp;
    String jobDesc;

    Integer maxOccur;
    Integer crntOccur;

    Integer hourDiff;
    Integer minDiff;
    Integer totalDiff;

    String invokeUnit;
    Integer invokeVal;
    String invokeYn;
}
