package com.abs.wfs.batch.dao.mybatis.dynamicQuery.service;


import com.abs.wfs.batch.dao.mybatis.dynamicQuery.DynamicQueryDto;
import com.abs.wfs.batch.dao.mybatis.dynamicQuery.mapper.DynamicQueryMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class DynamicQueryService {

    @Autowired
    DynamicQueryMapper dynamicQueryMapper;


    @Autowired
    SqlSession sqlSession;


    /**
     * Statement 들어오는 쿼리 문을 실행
     * @param dto
     * @return
     */
    public List<Map<String, Object>> executeDynamicQuery(DynamicQueryDto dto){

        return this.dynamicQueryMapper.executeDynamicQuery(dto);
    };




}
