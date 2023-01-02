# 简介
```text
设置响应数据
```
# 继承体系
```text
ServletResponse：Java提供的请求对象根接口
HttpServletResponse：Java提供的对Http协议封装的请求对象
ResponseFacade：Tomcat 定义的实现类
```
# 设置响应数据
```text
响应数据分为3部分
1.响应行: HTTP/1.1 200 0K
void setStatus(int sc): 设置响应状态码

2.响应头: Content-Type: text/html
void setHeader(String name String value): 设置响应头键值对

3.响应体: <html><head>head><body></body></html>
PrintWriter getWriter: 获取字符输出流
ServletOutputStream getOutputStream(): 获取字节输出流
```
# 重定向
```text
重定向(Redirect):一种资源跳转方式

实现方式：
resp.setStatus(302);
resp.setHeader(“location”“资源B的路径")
//简化方式
resp.sendRedirect("资源B的路径");

重定向特点:
浏览器地址栏路径发生变化
可以重定向到任意位置的资源(服务器内部、外部均可)
两次请求，不能在多个资源使用request共享数据
```

```text
Response 响应字符数据
使用
1.通过Response对象获取字符输出流
PrintWriter writer = resp.getWriter();
2.写数据
writer.write("aaa");
注意
该流不需要关闭，随着响应结束，response对象销毁，由服务器关闭
中文数据乱码:原因通过Response获取的字符输出流默认编码:ISO-8859-1
resp.setContentType("text/html;charset=utf-8");
```
# 响应字节数据
```text
Response 响应字节数据
使用:
1.通过Response对象获取字符输出流
ServletOutputStream outputStream = resp.getOutputStream();
写数据
outputStream.write(字节数据);

IOUtils工具类使用
1.导入坐标
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.6</version>
</dependency>
使用
lOUtils.copy(输入流,输出流);
```