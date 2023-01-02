# 简介
```text
Servlet 是Java提供的一门动态web资源开发技术.
Servlet 是JavaEE 规范之一，其实就是一个接口，将来我们需要定义Servlet类实现Servlet接口，并由web服务器运行Servlet
```
# 快速入门
# Servlet 执行流程
```text
1. Servlet 由谁创建?Servlet方法由谁调用?
Servlet由web服务器创建，Servlet方法由web服务器调用。
2. 服务器怎么知道Servlet中一定有service方法?
因为我们自定义的Servlet，必须实现Servlet接口并复写其方法，而Servlet接口中有service方法
```
# Servlet 生命周期
```text
对象的生命周期指一个对象从被创建到被销毁的整个过程

Servlet运行在Servlet容器(web服务器)中，其生命周期由容器来管理，分为4个阶段:
1. 加载和实例化:默认情况下，当Servlet第一次被访问时，由容器创建Servlet对象
    @WebServlet(urlPatterns = "/demo", loadOnStartup =1)
    负整数:第一次被访问时创建Servlet对象
    0或正整数:服务器启动时创建Servlet对象,数字越小优先级越高
    
2. 初始化:在Servlet实例化之后，容器将调用Servlet的init()方法初始化这个对象，完成一些如加载配置文件、创建连接等初始化的工作。该方法只调用一次
3. 请求处理:每次请求Servlet时，Servlet容器都会调用Servlet的service()方法对请求进行处理。
4. 服务终止:当需要释放内存或者容器关闭时，容器就会调用Servlet实例的destroy()方法完成资源的释放。在destroy()方法调用之后，容器会释放这个Servlet实例，该实例随后会被Java的垃圾收集器所回收
```
# Servlet 体系结构
```text
继承体系：
Servlet (javax.servlet)
GenericServlet (javax.servlet)
HttpServlet (javax.servlet.http)
```
# Servlet urlPattern配置
```text
Servlet urlPattern配置
Servlet 要想被访问，必须配置其访问路径(urlPattern
1.一个Servlet，可以配置多个 urlPattern
@WebServlet(urlPatterns = {"/demo1","/demo2"})
2.urlPattern 配置规则
    精配匹配：
        /user/select
    目录匹配：
        /user/*
    扩展名匹配（不能以斜杠开头）：
        *.do
        *.html
    任意匹配：
        /
        /*
        /和/*区别:
        当我们的项目中的Servlet配置了"/"，会覆盖掉tomcat中的DefaultServlet(导致静态资源无法访问)，当其他的 url-pattern都匹配不上时都会走这个Servlet
        当我们的项目中配置了"/*"，意味着匹配任意访问路径
优先级：精配匹配 > 目录匹配 > 扩展名匹配 > /* > /       
```
# XML 配置方式编写 Servlet
```text
Servlet 从3.0版本后开始支持使用注解配置，3.0版本前只支持XML配置文件的配置方式
步骤:
1.编写 Servlet类
2.在 web.xml中配置该Servlet

    <servlet>
        <servlet-name>MyServlet04</servlet-name>
        <servlet-class>com.yzm.servlet.MyServlet04</servlet-class>
    </servlet>
    <servlet-mapping>
        <servlet-name>MyServlet04</servlet-name>
        <url-pattern>/demo04</url-pattern>
    </servlet-mapping>
```