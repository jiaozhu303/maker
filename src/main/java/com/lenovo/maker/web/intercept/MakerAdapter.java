package com.lenovo.maker.web.intercept;


import com.lenovo.maker.web.intercept.MakerIntercepter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by zhaodongjie on 2017/4/16.
 */
@Configuration
public class MakerAdapter extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        registry.addInterceptor(new MakerIntercepter()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

}
