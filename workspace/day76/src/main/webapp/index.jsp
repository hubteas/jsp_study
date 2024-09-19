<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- method에 get을 작성하면 폼데이터를 get방식으로 서버에 전송하고
	method에 post로 작성하면 폼데이터를 post방식으로 서버에 전송한다
	즉, 우리가 method에 get을 쓰면 서블릿의 doGet()메소드가 실행된다 -->
	<form action="./hello" method="post">  
	<!-- 우리가 action에 경로를 어떻게 작성해야 서블릿으로 요청을 보낼 수 있을까?
		현재 페이지는 jsp 파일이고 자바파일인 서블릿으로 요청을 보내기 위해서는
		서블릿에 어노테이션으로 등록된 경로를 작성하면 된다
		주의할 점 : action="/hello" 슬래쉬를 붙여서 작성하면 contextPath가 사라지게 되므로 상대경로로(./hello) 작성하거나
		슬래쉬를 빼고(hello)작성한다
	 -->
		<input type="text" name="userName" placeholder="이름입력">
		<button>전송</button>
		<!-- button 태그는 기본타입이 submit이다
		submit 버튼은 현재 form태그의 action에 작성된 경로로 요청(request)를 보낸다
		이 때 request에는 현재 폼에 속해있는 모든 폼 데이터를 가지고 있다 -->
	</form>
</body>
</html>