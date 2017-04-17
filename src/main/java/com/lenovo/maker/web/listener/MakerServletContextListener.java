package com.lenovo.maker.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by zhaodj5 on 2017-04-17.
 */
@WebListener("/")
class MakerServletContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("MakerServletContextListener contextInitialized ... " );
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("MakerServletContextListener contextDestroyed ... " );
    }
}
