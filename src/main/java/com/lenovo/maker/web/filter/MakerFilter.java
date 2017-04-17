package com.lenovo.maker.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.xml.ws.WebFault;
import java.io.IOException;

/**
 * Created by zhaodj5 on 2017-04-17.
 */
@WebFilter(filterName="makerFilter",urlPatterns="/*")
public class MakerFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MakerFilter init ... ");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MakerFilter doFilter ... ");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("MakerFilter destroy ... ");
    }
}
