package com.abs.wfs.batch.dao.mybatis.dynamicQuery.mapper;


import com.abs.wfs.batch.dao.mybatis.dynamicQuery.DynamicQueryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DynamicQueryMapper {


    /**
     * Statement 들어오는 쿼리 문을 실행
     * @param dto
     * @return
     */
    List<Map<String, Object>> executeDynamicQuery(DynamicQueryDto dto);


}
