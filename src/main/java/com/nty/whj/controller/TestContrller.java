package com.nty.whj.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nty
 * @date 2020/7/17
 */
@RestController
@Slf4j
public class TestContrller {

    @GetMapping("test")
    public JSONObject testMethod(){
        log.info("调用接口");
        JSONObject resp = new JSONObject();
        resp.put("message","ok");
        return resp;
    }
}
