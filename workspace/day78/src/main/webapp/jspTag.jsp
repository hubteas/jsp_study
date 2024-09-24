<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 태그</title>
</head>
<body>
	<%-- 표현식 태그 : 현재 시간 출력 --%>
	<h1>현재시간 : <%=new java.util.Date() %></h1>
	
	<%!
		int num1 = 10;
		int num2 = 20;
		
		int addNum(){
			return num1 + num2;
		}
	%>
	
	<%--표현식 태그로 변수와 메소드 결과 출력 --%>
	<h1>num1의 값: <%=num1 %></h1>
	<h1>num2의 값: <%=num2 %></h1>
	<h1>두수의 합 : <%=addNum() %></h1>
	
	<!-- 스크립틀릿을 사용한 변수 선언 -->
	<%
		int num3 = 30;
	%>
	
	<h1>num3의 값 : <%=num3 %></h1>
	
	<br><br>
	
	<!-- 반복문 안에서 HTML요소를 함께출력 -->
	<%
		for(int i = 0; i<10; i++){
					
	%>
	<br>
	<span><%= i %>번째 반복입니다</span>
	<br>
	<span>======================</span>
	<br>
	<% } %> 
</body>
</html>