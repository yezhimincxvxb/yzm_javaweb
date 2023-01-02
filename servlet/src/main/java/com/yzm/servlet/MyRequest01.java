package com.yzm.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req01")
public class MyRequest01 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("获取请求行信息===");
        System.out.println("获取请求方式：" + req.getMethod());
        System.out.println("获取URL(统一资源定位符)：" + req.getRequestURL().toString());
        System.out.println("获取URI(统一资源标识符)：" + req.getRequestURI());
        System.out.println("获取虚拟目录(项目访问路径)：" + req.getContextPath());
        System.out.println("获取请求参数(GET方式)：" + req.getQueryString());
        System.out.println("=========================");
        System.out.println("获取请求头信息===");
        System.out.println("浏览器版本信息：" + req.getHeader("user-agent"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("获取请求体信息===");
        // 获取字符输入符
        BufferedReader reader = req.getReader();
        // 读取数据
        System.out.println(reader.readLine());
    }
}
