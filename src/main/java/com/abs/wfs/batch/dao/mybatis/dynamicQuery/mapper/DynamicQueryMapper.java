package com.abs.wfs.batch.dao.mybatis.dynamicQuery.mapper;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Mapper
public interface DynamicQueryMapper {


    /**
     * Statement 들어오는 쿼리 문을 실행
     * @param statement
     * @return
     */
//    List<Map<String, Object>> executeDynamicQuery(@Param("statement") Map<String, Object> query);

//    @Select("${statement}")
    List<Map<String, Object>> executeDynamicQuery(@Param("statement") Object statement);


}
