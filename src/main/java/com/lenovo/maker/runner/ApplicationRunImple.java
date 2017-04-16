package com.lenovo.maker.runner;

import com.lenovo.maker.DTO.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(Integer.MAX_VALUE - 1 )
@Component
public class ApplicationRunImple implements ApplicationRunner {

    @Autowired
    private TestDTO test;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println(test.getName());
        System.out.println("i am a  ApplicationRunner ... ");
    }
}
