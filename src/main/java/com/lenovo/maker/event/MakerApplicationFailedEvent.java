package com.lenovo.maker.event;

import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by zhaodj5 on 2017-04-18.
 */
//spring boot启动异常时执行事件
public class MakerApplicationFailedEvent implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent applicationFailedEvent) {
        System.out.println("事件监听-spring boot启动异常时执行事件");
    }
}
