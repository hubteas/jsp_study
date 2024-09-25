<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="student" method="get">
		<input type="text" name="name" placeholder="학생이름">
		<input type="text" name="age" placeholder="학생나이">
		<input type="radio" name="gender" value="M">남자
		<input type="radio" name="gender" value="M">여자
		<input type="text" name="major1" placeholder="전공1">
		<input type="text" name="major2" placeholder="전공2">
		<input type="text" name="major3" placeholder="전공3">
		<input type="text" name="score1" placeholder="점수1">
		<input type="text" name="score2" placeholder="점수2">
		<input type="text" name="score3" placeholder="점수3">
		<button>입력</button>
	</form>
	<!-- get 방식으로student라는 서블릿으로 보낸다
	web.xml을 사용하고 서블릿이름은 com.servlet.app.Myservlet으로 설정한다
	실행결과 student.jsp에 학생 이름과 나이, 성별을 출력되도록 한다 -->
</body>
</html>