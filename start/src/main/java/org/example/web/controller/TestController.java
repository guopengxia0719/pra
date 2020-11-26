package org.example.web.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "测试启动接口", produces = "application/json")
    @ResponseBody
    @GetMapping("/666")
    public String getResult(){
        return "get result !!!";
    }
}
