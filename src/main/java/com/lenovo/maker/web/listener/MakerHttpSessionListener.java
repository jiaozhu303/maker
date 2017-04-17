package com.lenovo.maker.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by zhaodj5 on 2017-04-17.
 */
@WebListener
public class MakerHttpSessionListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
         httpSessionEvent.getSession().setAttribute("name", "aaaa");
        System.out.println("MakerHttpSessionListener sessionCreated ... " );
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        Object name = httpSessionEvent.getSession().getAttribute("name");
        System.out.println("MakerHttpSessionListener sessionDestroyed ... " + name);
    }
}
