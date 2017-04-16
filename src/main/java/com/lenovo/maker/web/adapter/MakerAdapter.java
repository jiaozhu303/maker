package com.lenovo.maker.web.adapter;

import com.lenovo.maker.web.intercept.MakerIntercepter;
import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zhaodongjie on 2017/4/16.
 */
@Configurable
public class MakerAdapter extends WebMvcConfigurerAdapter {

    @Bean
    public MakerIntercepter localeChangeInterceptor() {
        return new MakerIntercepter();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());
    }

}
