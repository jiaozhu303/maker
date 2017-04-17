package com.lenovo.maker.web.error;

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
public class MakerErrorController implements ErrorAttributes{

    @Override
    public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean b) {
        System.out.println("getErrorAttributes .... ");
        return null;
    }

    @Override
    public Throwable getError(RequestAttributes requestAttributes) {
        System.out.println("getError .... ");
        return null;
    }
}
