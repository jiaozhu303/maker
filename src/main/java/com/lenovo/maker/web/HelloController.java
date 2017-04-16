package com.lenovo.maker.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * Created by zhaodongjie on 2017/4/16.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/", method= RequestMethod.GET)
    public String getHello(){
        return "hello world!";
    }
}
