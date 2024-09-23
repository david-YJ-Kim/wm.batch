package com.abs.wfs.batch.interfaces.rest;


import com.abs.wfs.batch.dao.mybatis.dynamicQuery.DynamicQueryDto;
import com.abs.wfs.batch.dao.mybatis.dynamicQuery.service.DynamicQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/qs")
@RequiredArgsConstructor
@Slf4j
public class DynamicQueryController {



    @Autowired
    DynamicQueryService dynamicQueryService;


    @GetMapping("/getQueryResult")
    public ResponseEntity<?> execute(@RequestBody String statement) throws SQLException {

        log.info("Entered StateMent:{}", statement);

        DynamicQueryDto queryDto = new DynamicQueryDto();
        queryDto.setStatement(statement);

        try{

            List<Map<String, Object>> rs = this.dynamicQueryService.executeDynamicQuery(queryDto);
            return new ResponseEntity<>(rs, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }


}
