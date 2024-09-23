package com.abs.wfs.batch.interfaces.rest;


import com.abs.wfs.batch.dao.mybatis.dynamicQuery.service.DynamicQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/util")
@RequiredArgsConstructor
@Slf4j
public class DynamicQueryController {



    @Autowired
    DynamicQueryService dynamicQueryService;


    @GetMapping("/healthCheck")
    public List<Map<String, Object>> execute(@RequestBody String statement) {
        log.info("Entered StateMent:{}", statement);

        return this.dynamicQueryService.executeDynamicQuery(statement);
    }


}
