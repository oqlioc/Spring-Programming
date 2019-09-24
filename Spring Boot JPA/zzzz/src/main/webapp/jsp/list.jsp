<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>Spring JPA 게시판</title>
<style type="text/css">
.tooltip {
	position: absolute;
	z-index: 3;
	background: #E8E8E8;
	border: 1px solid #434343;
	padding: 3px;
}
</style>
</head>
<body>
	<div style="width: 500px;">
		<div style="float: center;">
			<H3 align="center">
				Spring Data JPA 게시판<br>(글리스트보기)
			</H3>
			<table width="600" border="1" align="left">
				<tr align="left">
					<td width="10%" align="center">글번호</td>
					<td width="10%" align="center">이름</td>
					<td width="10%" align="center">비번</td>
					<td width="20%" align="center">제목</td>
					<td width="40%" align="center">내용</td>
				</tr>
				<c:forEach var="Board1" items="${list}">
				<tr>
					<td align="center">${Board1.id}</td>
					<td align="center">${Board1.name}</td>
					<td align="center">${Board1.passwd}</td>
					<td align="left">${Board1.title}</td>
					<td align="center"><a href="detail?id=${Board1.id}">${Board1.content}</a></td>
				</tr>
				</c:forEach>
			</table>
			<div>
				<input type="button" value="글쓰기" onclick="location.href='writeform'">
			</div>
		</div>
	</div>
</body>
</html>