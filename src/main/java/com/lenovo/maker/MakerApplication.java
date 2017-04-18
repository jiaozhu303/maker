package com.lenovo.maker;
import com.lenovo.maker.event.MakerApplicationFailedEvent;
import com.lenovo.maker.event.MakerApplicationPreparedEvent;
import com.lenovo.maker.event.MakerEnvironmentPreparedEvent;
import com.lenovo.maker.event.MakerStartedEvent;
import com.lenovo.maker.listeners.MakerListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@ServletComponentScan
@SpringBootApplication
public class MakerApplication {

    //    代码注册servlet
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new MakerServlet(), "/maker");// ServletName默认值为首字母小写
//    }
//
//    @Bean
//    public FilterRegistrationBean filterRegistrationBean() {
//        return new FilterRegistrationBean(new MakerFilter(), servletRegistrationBean());// ServletName默认值为首字母小写，即myServlet
//    }
//
//    @Bean
//    public ServletListenerRegistrationBean servletListenerRegistrationBean() {
//        return new ServletListenerRegistrationBean(new MakerHttpSessionListener());// ServletName默认值为首字母小写，即myServlet
//    }

    public static void main(String[] args) {
//		  SpringApplication.run(MakerApplication.class, args);
        SpringApplication app = new SpringApplication(MakerApplication.class);
        app.addListeners(new MakerStartedEvent());
        app.addListeners(new MakerEnvironmentPreparedEvent());
        app.addListeners(new MakerListener());
        app.addListeners(new MakerApplicationPreparedEvent());
        app.addListeners(new MakerApplicationFailedEvent());
        app.setWebEnvironment(true);
        app.run(args);
    }

    @PostConstruct
    public void init() {
        System.out.println("init app ...");
    }

    @PreDestroy
    public void distoryMath() {
        System.out.println("distroy app ... ");
    }
}
