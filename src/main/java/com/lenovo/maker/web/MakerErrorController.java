package com.lenovo.maker.web;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.request.RequestAttributes;

import java.util.Map;

/**
 * Created by zhaodongjie on 2017/4/16.
 */
@Configurable
public class MakerErrorController {


    @Bean
    public ErrorAttributes getError(){
        return new ErrorAttributes() {
            @Override
            public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
                return null;
            }

            @Override
            public Throwable getError(RequestAttributes requestAttributes) {
                return null;
            }
        };
    }
}
