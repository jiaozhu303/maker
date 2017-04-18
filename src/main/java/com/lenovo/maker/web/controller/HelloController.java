package com.lenovo.maker.web.controller;

import com.lenovo.maker.service.MakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * Created by zhaodongjie on 2017/4/16.
 */
@RestController
@RequestMapping(value = "/maker")
public class HelloController {

    @Autowired
    private MakerService makerService;

    @RequestMapping(value = "/def" ,method= RequestMethod.GET)
    public String getHello(){
        return "hello world!";
    }

    @RequestMapping(value = "/use",method= RequestMethod.GET)
    public String getHello2(){
        return "hello2 world! " + makerService.getName(1);
    }
}
