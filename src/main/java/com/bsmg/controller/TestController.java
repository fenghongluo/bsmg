package com.bsmg.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangjianwei
 * @create 2021/2/24
 * @email jianwei.zhang@nvr.cn
 * @description ceshi
 */
@Slf4j
@RestController
public class TestController {
    @GetMapping("/string")
    public String retString(){
        log.info("ssss");
        return "ssss";
    }

}
