<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="jstlServlet">
		<input type="hidden" name="id" value="admin">
		<button>admin</button>
	</form>
	
	<form action="jstlServlet">
		<button type="submit" name="id" value="member">member</button>
	</form>
	<p>	<c:if test="${ id eq 'admin'}">관리자</c:if></p>
	<p>	<c:if test="${ id eq 'member'}">멤버</c:if></p>

	<!-- jstl을 사용하여 현재 로그인된 계정이 관리자 계정인지, 일반계정인지 출력하기 -->
</body>
</html>