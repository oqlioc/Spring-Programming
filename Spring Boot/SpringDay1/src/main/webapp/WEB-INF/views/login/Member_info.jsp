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
				<td>${info_list.id}</td>
				<td>${info_list.pw}</td>
				<td>${info_list.email}</td>
				<td>${info_list.name}</td>
				<td>${info_list.address}</td>
			</tr>
		<%
		/*
			Connection conn = null;
			PreparedStatement preparedStatement = null;
			ResultSet resultSet = null;
			String id = request.getParameter("uid");
			System.out.println(request.getParameter("uid"));
			
			try {
				Context context = new InitialContext();
				DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/Oracle11g");
				conn = dataSource.getConnection();
			
				String query = "select UTID, UTNAME, UTNIC from UT1 where UTID = ?";
				preparedStatement = conn.prepareStatement(query);
				preparedStatement.setString(1, id);
				resultSet = preparedStatement.executeQuery();
				
				while (resultSet.next()) {
					if (id.equals(resultSet.getString(1))) {
						String UTID1 = resultSet.getString("UTID");
						String UTNAME1 = resultSet.getString("UTNAME");
						String UTNIC1 = resultSet.getString("UTNIC");
		*/
		%>
		<%--
			<tr>
				<td><%=UTID1%></td>
				<td><%=UTNAME1%></td>
				<td><%=UTNIC1%></td>
			</tr>
		--%>
		<%
		/*
			}
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