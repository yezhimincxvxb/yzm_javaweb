# 简介
```text
概念:Tomcat是Apache 软件基金会一个核心项目，是一个开源免费的轻量级Web服务器，支持Servlet/JSP 少量JavaEE规范。
JavaEE:Java Enterprise Edition，Java企业版。指Java企业级开发的技术规范总和。
包含13项技术规范:JDBC、JNDI、EJB、RMI、JSP、Servlet、XML、JMS、Java IDL、JTS、JTA、JavaMail、JAR
Tomcat 也被称为 Web容器、Servlet容器。Servlet 需要依赖于 Tomcat才能运行
官网:https://tomcat.apache.org/

1. Web 服务器作用?
    封装HTTP协议操作，简化开发
    可以将web项目部署到服务器中，对外提供网上浏览服务
2.Tomcat是一个轻量级的Web服务器，支持Servlet/JSP少量JavaEE规范，也称为Web容器，Servlet容器
```
# 目录
```text
bin 可执行文件存放目录 
conf 配置文件存放目录 
lib tomcat依赖的jar包 
logs 日志文件 
temp 临时文件 
webapps 应用发布目录
work 工作目录
```
# 控制台乱码
```text
修改conf/logging.properties
java.util.logging.ConsoleHandler.encoding = GBK
```
# 基本使用
```text
Tomcat-基本使用
配置:
1. 修改启动端口号:conf/server.xml
Connector port="8080" protocol="HTTP/1.1" 
connectionTimeout="20000" redirectPort="8443" />

注:HTTP协议默认端口号为80，如果将Tomcat端口号改为80，则将来访问Tomcat时，将不用输入端口号

启动时可能出现的问题:
1. 端口号冲突:找到对应程序，将其关闭掉
At org.apache.catalina.startup.Bootstrap. load(Bootstrap. Java at org.apache.catalina.startup.Bootstrap.main(Bootstrap.iava
Caused bv: iava.net.BindException: Address already in use: bind 
at sun.nio.ch.Net.bind0(Native Method) at sun.nio.ch.Net.bind(Net.java:433)

2. 启动窗口一闪而过:检查JAVA HOME环境变量是否正确配置
```
# 部署项目
```text
Tomcat 部署项目:
 将项目放置到 webapps 目录下，即部署完成

一般JavaWeb项目会被打成war包，然后将war包放到 webapps目录下，Tomcat会自动解压缩 war文件
hello.war
```