package com.lenovo.maker.runner;

import com.lenovo.maker.DTO.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Order(Integer.MAX_VALUE - 2 )
@Component
public class CommandLineRunnerImple implements CommandLineRunner {

    @Autowired
    private Environment env;

    @Bean
    private TestDTO getDTO(){
        TestDTO test = new TestDTO(1,"222");
        return test;
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(env.getProperty("name"));
        System.out.println("i am a CommandLinerRunner .... ");
    }
}
