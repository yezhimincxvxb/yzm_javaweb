# 简介
```text
获取请求数据
```
# Request 继承体系
```text
ServletRequest：Java提供的请求对象根接口
HttpServletRequest：Java提供的对Http协议封装的请求对象接口
RequestFacade：Tomcat 定义的实现类
```
# Request获取请求数据
```text
请求行:
GET /request-demo/req1?username=zhangsan HTTP/1.1
String getMethod0: 获取请求方式: GET
String getContextPath: 获取虚拟目录(项目访问路径): /request-demo
StringBuffer getRequestURL): 获取URL(统一资源定位符): http://localhost:8080/request-demo/req1
String getRequestURI: 获取URI(统一资源标识符):request-demo/req1
String getQueryString: 获取请求参数(GET方式): username=zhangsan&password=123

请求头：
User-Agent: Mozilla/5.0 Chrome/91.0.4472.106
String getHeader(String name): 根据请求头名称，获取值

请求体：
username=superbaby&password=123
ServletInputStream getInputStream0:获取字节输入流BufferedReader getReader0): 获取字符输入流
```
```text
Map<String,String[]> getParameterMap(): 获取所有参数Map集合
String[] getParameterValues(String name): 根据名称获取参数值 (数组)
String getParameter(String name): 根据名称获取参数值 (单个值)
```
# Request 请求转发
```text
请求转发(forward):一种在服务器内部的资源跳转方式

实现方式
req.getRequestDispatcher("资源B路径").forward(req,resp);
请求转发资源间共享数据:使用Request对象
void setAttribute(String name, Object o): 存储数据到 request域中
Object getAttribute(String name): 根据 key，获取值
void removeAttribute(String name): 根据 key，删除该键值对

请求转发特点
浏览器地址栏路径不发生变化
只能转发到当前服务器的内部资源
一次请求，可以在转发的资源间使用request共享数据
```