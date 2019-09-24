<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="modified" method="post">
	<input type="text" name="name" id="name" value="">
	<input type="text" name="passwd" id="passwd" value="">
	<input type="text" name="title" id="title" value="">
	<input type="text" name="content" id="content" value="">
	<input type="submit">
	<input type="button" value="삭제" onclick="location.href='delete'">
</form>
</body>
</html>