# 简介
```text
JavaScript 是一门跨平台、面向对象的脚本语言，来控制网页行为的，它能使网页可交互 
W3C 标准:网页主要由三部分组成
    结构:HTML
    表现:CSS
    行为:JavaScript
JavaScript 和 Java 是完全不同的语言，不论是概念还是设计。但是基础语法类似。
JavaScript(简称:JS)在1995年由 Brendan Eich 发明，并于1997年成为一部 ECMA 标准。
ECMAScript 6(ES6) 是最新的 JavaScript 版本(发布于 2015年)。
```
# JavaScript 引入方式
```text
1. 内部脚本: 将JS代码定义在HTML页面中
在HTML中，JavaScript 代码必须位于<script>与</script>标签之间
<script>
    alert("hello JS ~");
</script>
提示:
在 HTML文档中可以在任意地方，放置任意数量的<script>。
一般把脚本置于<body>元素的底部，可改善显示速度，因为脚本执行会拖慢显示

2.外部脚本:将JS代码定义在外部 JS文件中，然后引入到 HTML页面中
外部文件:demo.js alert("hello JS ~"); 
引入外部 js文件 <script src=“../js/demo.js"></script> 
注意:
1. 外部脚本不能包含<script>标签
2. <script> 标签不能自闭合
```
# JavaScript 基础语法
### 书写语法
```text
1. 区分大小写:与Java 一样，变量名、函数名以及其他一切东西都是区分大小写的
2. 每行结尾的分号可有可无
3. 注释:
    单行注释: // 注释内容
    多行注释: /* 注释内容 */
4. 大括号表示代码块
if(count == 3) {
    alert(count);
}
```
### 输出语句
```text
使用window.alert()写入警告框
使用document.write()写入HTML输出
使用console.log()写入浏览器控制台
window.alert("hello JS ~");//弹出警告框
document.write("hello JS ~");//写入HTML
console.log("hello JS ~");//写入控制台
```
### 变量
```text
JavaScript 中用 var 关键字(variable的缩写)来声明变量
var test = 20; test="张三";

JavaScript 是一门弱类型语言，变量可以存放不同类型的值
变量名需要遵循如下规则:
    组成字符可以是任何字母、数字、下划线(_)或美元符号($)
    数字不能开头
    建议使用驼峰命名
    
ECMAScript6 新增了 let 关键字来定义变量。它的用法类似于 var，但是所声明的变量，只在 let 关键字所在的代码块内有效，且不允许重复声明
ECMAScript6新增了 const关键字，用来声明一个只读的常量。一日声明，常量的值就不能改变。
```
### 数据类型
```text
JavaScript 中分为:原始类型和引用类型5种原始类型:
    number:数字(整数、小数、NaN(Not a Number)) 
    string:字符、字符串，单双引皆可
    boolean:布尔。true，false
    null:对象为空
    undefined:当声明的变量未初始化时，该变量的默认值是 undefined

使用 typeof 运算符可以获取数据类型 alert(typeof age);
```
### 运算符
```text
一元运算符:  ++，--
算术运算符:  +，-，*，1，%
赋值运算符:  =，+=，-=..
关系运算符:  >，<，>=，<=，!=，==，===
逻辑运算符:  &&，l，!
三元运算符:  条件表达式?true_value:false_value

==和===:
==会进行类型转换，==不会进行类型转换

类型转换:
其他类型转为数字:
    1. string:将字符串字面值转为数字。如果字面值不是数字，则转为NaN。一般使用parseInt方法进行转换
    2.boolean:true 转为1，false 转为0
其他类型转为 boolean
    1. number:0和NaN转为false，其他的数字转为true
    2.string:空字符串转为false，其他字符串转为true
    3. null:转为false
    4. undefined:转为false
```
### 流程控制语句
```text
if:
switch： 
for: 
while:
do...while:
```
### 函数
```text
函数(方法)是被设计为执行特定任务的代码块
定义:JavaScript 函数通过 function 关键词进行定义，语法为:
function functionName(参数1,参数2..){
    要执行的代码
}
注意:
   形式参数不需要类型。因为JavaScript是弱类型语言
   返回值也不需要定义类型，可以在函数内部直接使用return返回即可

function add(a,b){
    return a + b;
}
调用:函数名称(实际参数列表);
let result = add(1,2);
```
# JavaScript 常用对象
Array
```text
JavaScript Array对象用于定义数组智 定义
var 变量名 = new Array(元素列表); //方式一 var arr = new Array(1,2,3); 
var 变量名 = [元素列表]; //方式二 var arr = [1,2,3]; 
访问
arr[索引]=值;
arr[0] = 1;
注意:JS数组类似于Java集合，长度，类型都可变
```
String
```text
var 变量名 = new String(s);//方式一 o var st = new String("hello"); 
var 变量名 = s; 1/方式二 var str = "hello"; 
var str = 'hello';
属性
length 字符串的长度 
方法
charAt() 返回在指定位置的字符。 
indexOf() 检索字符串。
```
自定义对象
```text
格式 . 示例 
var 对象名称 = {  
    属性名称1:属性值1, 
    属性名称2:属性值2.
    ... 
    函数名称:function (形参列表)
    ...
} 
```
# BOM
```text
Browser Object Model 浏览器对象模型
JavaScript 将浏览器的各个组成部分封装为对象· 组成:
    Window:浏览器窗口对象
    Navigator:浏览器对象。 
    Screen:屏幕对象
    History:历史记录对象
    Location:地址栏对象
```
### Window
```text
Window:浏览器窗口对象
获取:直接使用 window，其中window.可以省略
window.alert("abc");

属性:获取其他 BOM对象
    history 对 History 对象的只读引用。请参数 History 对象。 
    Navigator 对 Navigator 对象的只读引用。请参数 Navigator 对象。 
    Screen 对 Screen 对象的只读引用。请参数 Screen 对象。 
    location 用于窗口或框架的 Location 对象。请参阅 Location 对象。 
方法：
    alert() 显示带有一段消息和一个确认按钮的警告框。 
    confirm() 显示带有一段消息以及确认按钮和取消按钮的对话框。 
    setInterval() 按照指定的周期(以毫秒计)来调用函数或计算表达式 
    setTimeout() 在指定的毫秒数后调用函数或计算表达式。
```
### History
```text
History:历史记录
获取:使用 window.history获取，其中window.可以省略
    window.history.方法(); 
    history.方法();
方法
    back() 加载 history 列表中的前一个 URL。 
    forward() 加载 history 列表中的下一个 URL。
```
### Location
```text
Location:地址栏对象
获取:使用 window.location获取，其中window.可以省略
    window.location.方法(); 
    location.方法();
属性
    href 设置或返回完整的 URL。
```
# DOM
```text
Document Object Model 文档对象模型
将标记语言的各个组成部分封装为对象
    Document:整个文档对象
    Element:元素对象 
    Attribute:属性对象
    Text:文本对象
    Comment:注释对象
```
### Element
```text
Element:元素对象
获取:使用Document对象的方法来获取
1. getElementById:根据id属性值获取，返回一个Element对象
2. getElementsByTagName:根据标签名称获取，返回Element对象数组
3. getElementsByName:根据name属性值获取，返回Element对象数组
4.getElementsByClassName:根据class属性值获取，返回Element对象数组
```
# 事件监听
```text
事件:HTML事件是发生在 HTML元素上的“事情”。比如:
    按钮被点击
    鼠标移动到元素之上。
    按下键盘按键
事件监听:JavaScript 可以在事件被侦测到时执行代码
```
### 事件绑定
```text
事件绑定有两种方式:
方式一:通过 HTML标签中的事件属性进行绑定
    <input type="button" onclick='on()'>
    function on(){
        alert("我被点了");
    }
方式二:通过 DOM 元素属性绑定
    <input type="button" id="btn">
    document.getElementByld("btn").onclick = function (){ alert("我被点了");}
```
### 常见事件
```text
onabort 图像的加载被中断。
onblur 元素失去焦点。
onchange 域的内容被改变。
onclick 当用户点击某个对象时调用的事件句柄。
ondblclick 当用户双击某个对象时调用的事件句柄。
onerror 在加载文档或图像时发生错误。
onfocus 元素获得焦点。
onkeydown 某个键盘按键被按下。
onkeypress 某个键盘按键被按下并松开。
onkeyup 某个键盘按键被松开。
onload 一张页面或一幅图像完成加载，
onmousedown 鼠标按钮被按下。
onmousemove 鼠标被移动。
onmouseout 鼠标从某元素移开。
onmouseover 鼠标移到某元素之上。
onmouseup 鼠标按键被松开。
onreset 重置按钮被点击。
onresize 窗口或框架被重新调整大小。
onselect 文本被选中。
onsubmit 确认按钮被点击。
onunload 用户退出页面。
```
# 正则表达式
```text
概念:正则表达式定义了字符串组成的规则
定义:
1. 直接量:注意不要加引号
    var reg = /^\w{6,12}$/;
2. 创建 RegExp 对象
    var reg = new RegExp("^1lw{6,12}$");

方法:
test(str):判断指定字符串是否符合规则，返回 true或 false
```
语法
```text
^:表示开始· 
$:表示结束
[]:代表某个范围内的单个字符，比如: [0-9] 单个数字字符· 
.:代表任意单个字符，除了换行和行结束符
\w:代表单词字符:字母、数字、下划线(_)，相当于 [A-Za-zO-9_]
\d:代表数字字符: 相当于 [0-9]

量词:
+:至少一个 var reg = /^\w+$/; 
*:零个或多个。 ?:零个或一个
{x}: x个
{m,}:至少m个
{m,n}:至少m个，最多n个
```