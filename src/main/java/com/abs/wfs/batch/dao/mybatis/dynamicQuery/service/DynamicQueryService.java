package com.abs.wfs.batch.dao.mybatis.dynamicQuery.service;


import com.abs.wfs.batch.dao.mybatis.dynamicQuery.mapper.DynamicQueryMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
     * @param statement
     * @return
     */
//    public List<Map<String, Object>> executeDynamicQuery(Object statement){
//        System.out.println("JDBC Driver Version: " + oracle.jdbc.OracleDriver.getDriverVersion());
//
//        return this.dynamicQueryMapper.executeDynamicQuery(statement);
//    };


    public List<Map<String, Object>> executeDynamicQuery(String statement){
        HashMap<String, String> input = new HashMap<>();
        input.put("statement", statement);
//        return sqlSession.selectList(statement);
        return sqlSession.selectList(
                "com.abs.wfs.batch.dao.mybatis.DynamicQueryMapper.executeDynamicQuery",
                input);

    }





}
