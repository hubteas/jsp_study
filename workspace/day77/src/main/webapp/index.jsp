<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp 페이지</title>
</head>
<body>
	<form action="Hello" method="get">
		<input type="text" name="userName" placeholder="이름입력">
		<br>
		<input type="text" name="userAge" placeholder="나이입력">
		<br>
		<input type="radio" name="userGender" value="선택안함">선택안함
		<input type="radio" name="userGender" value="남자">남자
		<input type="radio" name="userGender" value="여자">여자
		<br>
		<input type="checkbox" name=interest value="축구">축구
		<input type="checkbox" name=interest value="농구">농구
		<input type="checkbox" name=interest value="탁구">탁구
		<input type="checkbox" name=interest value="배구">배구
		<br>
		<button>전송</button>
		
	</form>

</body>
</html>