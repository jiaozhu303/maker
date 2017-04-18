package com.lenovo.maker.event;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by zhaodj5 on 2017-04-18.
 */
//spring boot启动开始时执行的事件
public class MakerStartedEvent implements ApplicationListener<ApplicationStartedEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        System.out.println("事件监听器-应用启动开始。。。");
    }
}
