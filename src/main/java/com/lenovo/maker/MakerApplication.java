package com.lenovo.maker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
public class MakerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(MakerApplication.class, args);
		SpringApplication app = new SpringApplication(MakerApplication.class);
//		app.addInitializers();
		app.setAdditionalProfiles("classpath:/profile/spring-all.profile");
		app.setWebEnvironment(true);
		app.run(args);
	}

	@PostConstruct
	public void init(){
        System.out.println("init app ...");
    }

	@PreDestroy
	public void distoryMath(){
		System.out.println("distroy app ... ");
	}
}
