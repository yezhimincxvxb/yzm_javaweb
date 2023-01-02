package com.yzm.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(value = "/demo02", loadOnStartup = 1)
public class MyServlet02 implements Servlet {
    /**
     * 初始化方法
     * 默认情况下，servlet被第一次访问的时候，调用
     * 修改 loadOnStartup > 0，则web服务启动时，调用
     * 只被调用一次
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");
    }

    /**
     * 获取ServletConfig对象
     *
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * 提供服务
     * 每次Servlet被访问都会被调用
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet Yzm!");
    }


    /**
     * 获取Servlet信息
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 销毁方法，当Servlet被销毁时，调用该方法。在内存释放或服务器关闭时销毁Servlet
     * 只被调用一次
     */
    @Override
    public void destroy() {
        System.out.println("destroy...");
    }
}
