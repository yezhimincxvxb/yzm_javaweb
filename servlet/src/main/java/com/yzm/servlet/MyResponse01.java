package com.yzm.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/resp01")
public class MyResponse01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("=========resp01=========");

        //重定向
//        //1.设置啊应状态码 302
//        resp.setStatus(302);
//        //2. 设置啊应义 Location
//        resp.setHeader("Location","/servlet/resp02");

        // 简化方式
//        resp.sendRedirect("/servlet/resp02");
        resp.sendRedirect(req.getContextPath() +"/resp02");
        // 访问外部服务资源
//        resp.sendRedirect("https://www.baidu.com");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
