package com.lenovo.maker.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by zhaodj5 on 2017-04-17.
 */
// 不指定name的情况下，name默认值为类全路径，即com.lenovo.maker.web.servlet.MakerServlet
@WebServlet(urlPatterns="/def", description="Servlet的说明")
public class MakerServlet extends HttpServlet {

    private static final long serialVersionUID = -8685285401859800066L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MakerServlet get ...");
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MakerServlet post ... ");

    }

}
