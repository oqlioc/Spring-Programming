<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*"%>
<%@ page import="javax.naming.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>아이디</th>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>

				<td><a href="Member_info.lo?id=${dto.id}" >${dto.id}</a></td>
				<td><a href="Membe_delete.lo?id=${dto.id}">Delete</a></td>
			</tr>
		</c:forEach>
		<%
			/*
				ArrayList<String> user = new ArrayList<String>();
				Connection conn = null;
				PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				
				try {
					Context context = new InitialContext();
					DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
					conn = dataSource.getConnection();
				
					String query = "select UTID, UTNAME, UTNIC from UT1";
					preparedStatement = conn.prepareStatement(query);
					resultSet = preparedStatement.executeQuery();
				
					while (resultSet.next()) {
						String UTID1 = resultSet.getString("UTID");
						String UTNAME1 = resultSet.getString("UTNAME");
						String UTNIC1 = resultSet.getString("UTNIC");
			*/
		%>
		<%--
		<tr>
			<td><a href="Member_info.jsp?uid=<%=UTID1%>" ><%=UTID1%></a></td>
			<td><a href="Membe_delete.jsp?uid=<%=UTID1%>">Delete</a></td>
		</tr>
		--%>
		<%
			/*
			}
			
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			} finally {
			try {
				if (resultSet != null)
					resultSet.close();
				if (preparedStatement != null)
					preparedStatement.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			}
			*/
		%>

	</table>

</body>
</html>