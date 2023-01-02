# 简介
```text
概念:HyperText Transfer Protocol，超文本传输协议，规定了浏览器和服务器之间数据传输的规则
```
# 协议特点
```text
HTTP 协议特点:
1. 基于TCP协议:面向连接，安全
2. 基于请求-响应模型的:一次请求对应一次响应
3. HTTP协议是无状态的协议:对于事务处理没有记忆能力。每次请求-响应都是独立的。
     缺点:多次请求间不能共享数据。
     优点:速度快
```
# 请求数据格式
```text
HTTP-请求数据格式
请求数据分为3部分:
1. 请求行:请求数据的第一行。其中GET表示请求方式，/表示请求资源路径，HTTP/1.1表示协议版本
2. 请求头:第二行开始，格式为key:value形式。
3. 请求体: POST请求的最后一部分，存放请求参数

GET/HTTP/1.1
Host:www.itcast.cn 
Connection: keep-alive
Cache-Control: max-age=0 Upgrade-Insecure-Requests:1 U
ser-Agent: Mozilla/5.0 Chrome/91.0.4472.106
...

常见的HTTP 请求头:
Host: 表示请求的主机名
User-Agent: 浏览器版本，例如Chrome浏览器的标识类似Mozilla/5.0 ..
Chrome/79，IE浏览器的标识类似Mozilla/5.0 (Windows NT .…) like Gecko;
Accept:表示浏览器能接收的资源类型，如text/*，image/*或者*/*表示所有;
Accept-Language:表示浏览器偏好的语言，服务器可以据此返回不同语言的网页;
Accept-Encoding:表示浏览器可以支持的压缩类型，例如gzip,deflate等。
```
# GET POST
```text
GET请求和 POST请求区别:
1. GET请求请求参数在请求行中，没有请求体。POST请求请求参数在请求体中
2. GET请求请求参数大小有限制，POST没有
```
# 响应数据格式
```text
HTTP-响应数据格式
响应数据分为3部分:
1. 响应行:响应数据的第一行。其中HTTP/1.1表示协议版本，200表示响应状态码，OK表示状态码描述
2. 响应头:第二行开始，格式为key:value形式
3. 响应体: 最后一部分。存放响应数据

HTTP/1.1 200 OK 
Server: Tengine
Content-Type: text/html
Transfer-Encoding: chunked
...

状态码分类 说明
1xx 响应中--临时状态码，表示请求已经接受，告诉客户端应该继续请求或者如果它已经完成则忽略它
2xx 成功--表示请求已经被成功接收，处理已完成 
3XX 重定向--重定向到其它地方:它让客户端再发起一个请求以完成整个处理。 
4XX 客户端错误--处理发生错误，责任在客户端，如:客户端的请求一个不存在的资源，客户端未被授权，禁止访问等 
5xx 服务器端错误--处理发生错误，责任在服务端，如:服务端抛出异常，路由出错，HTTP版本不支持等

常见的HTTP 响应头:
Content-Type:表示该响应内容的类型，例如text/html image/jpeg;
Content-Length:表示该响应内容的长度(字节数);
Content-Encoding:表示该响应压缩算法，例如gzip;
Cache-Control:指示客户端应如何缓存，例如max-age=300表示可以最多缓存300秒
```
### 状态码大全 https://cloud.tencent.com/developer/chapter/13553
