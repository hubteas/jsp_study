<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>학생 정보 출력</title>
</head>
<body>
    <h2>학생 정보</h2>
    <p>이름: <c:out value="${name}"></c:out></p>
    <p>나이: <c:out value="${age}"></c:out></p>
    <p>성별: <c:out value="${gender}"></c:out></p>
    
    <c:set var="sumScore" value="0"/>
    <c:set var="sumScore" value="${ sumScore+score1+score2+score3}"/>
    
   	<p>성적 합 : <c:out value="${sumScore}"></c:out></p>

   	<p>합 : <c:out value="${score1+score2+score3 }"></c:out></p>
</body>
</html>