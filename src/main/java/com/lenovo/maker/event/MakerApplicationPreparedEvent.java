package com.lenovo.maker.event;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by zhaodj5 on 2017-04-18.
 */
//spring boot上下文context创建完成，但此时spring中的bean是没有完全加载完成的。
public class MakerApplicationPreparedEvent implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {
        System.out.println("事件监听-上下文context创建完成，但此时spring中的bean是没有完全加载完成的。");
    }
}
