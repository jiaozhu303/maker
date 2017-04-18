package com.lenovo.maker.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by zhaodj5 on 2017-04-18.
 */
public class MakerListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("自定义springboot监听器。。。");
    }
}
