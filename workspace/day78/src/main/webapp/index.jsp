<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form action="MyServlet" method="get">
		<input type="text" name="userName" placeholder="이름입력">
		<input type="text" name="userSubject" placeholder="과목입력">
		<button>전송</button>
	</form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>