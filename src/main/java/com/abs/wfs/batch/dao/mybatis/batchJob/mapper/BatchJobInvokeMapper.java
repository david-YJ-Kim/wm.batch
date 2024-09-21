package com.abs.wfs.batch.dao.mybatis.batchJob.mapper;


import com.abs.wfs.batch.dao.mybatis.batchJob.vo.BatchJobInvokeQueryDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BatchJobInvokeMapper {

    /**
     * 등록된 배치 잡 기준 정보 가져와서
     * @return
     */
    BatchJobInvokeQueryDto batchJobInvokeQuery ();
}
