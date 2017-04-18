package com.lenovo.maker.event;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by zhaodj5 on 2017-04-18.
 */
//spring boot 对应Enviroment已经准备完毕，但此时上下文context还没有创建。
public class MakerEnvironmentPreparedEvent implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent applicationEnvironmentPreparedEvent) {
        System.out.println("事件监听-对应Enviroment已经准备完毕，但此时上下文context还没有创建。");
    }
}
