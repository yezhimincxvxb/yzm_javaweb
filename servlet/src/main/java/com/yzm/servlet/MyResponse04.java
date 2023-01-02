package com.yzm.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/resp04")
public class MyResponse04 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 读取文件
        InputStream in = this.getClass().getResourceAsStream("a.png");
//        FileInputStream fis = new FileInputStream("d://a.jpg");
        //2.获取response字节输出流
        ServletOutputStream os = resp.getOutputStream();
        //3.完成流的copy
        byte[] buff = new byte[1024];
        int len = 0;
        while ((len = in.read(buff)) != -1) {
            os.write(buff, 0, len);
        }

        in.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
