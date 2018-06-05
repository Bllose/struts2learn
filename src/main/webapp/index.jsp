<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Welcome To Struts 2!</h1>
        <!-- 点击这个连接,url会变成 /hello，从而被struts过滤器拦截，调用action为hello的类 -->
        <p><a href="<s:url action='hello'/>">Hello World</a></p>
        
        <!-- 将url单独抽出，且能传参数，匹配名字调用对应的set方法 -->    
        <s:url action="hello" var="helloLink">
		  <s:param name="userName">Bruce Phillips</s:param>
		</s:url>		
		<p><a href="${helloLink}">Hello Bruce Phillips</a></p>
		
		<p>Get your own personal hello by filling out and submitting this form.</p>

		<!-- struts2的输入框，传入参数，调用对应的get方法 -->
		<s:form action="hello">
		  <s:textfield name="userName" label="Your name" />
		  <s:submit value="Submit" />
		</s:form>
		
		<!-- 跳转到指定jsp页面 -->
		<p><a href="register.jsp">Please register</a> for our prize drawing.</p>
    </body>
</html>
