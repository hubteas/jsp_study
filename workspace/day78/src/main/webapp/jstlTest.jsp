<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% pageContext.setAttribute("name", "짱구"); %>
	<h1> 이름 : ${name}</h1>
	<h1> 서블릿에서 받아온 이름 : ${requestScope.name }</h1>
	<h1>과목 : ${subject}</h1>
</body>
</html>