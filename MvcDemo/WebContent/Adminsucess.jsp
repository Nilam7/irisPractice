<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<h3>WELCOME <%=session.getAttribute("userName") %></h3><br>
<a href="register.jsp">Register a new Candidate</a><br>
<a href="view.jsp">View a Candidate</a><br>
<a href="Delete.jsp">Delete a  Candidate from database</a><br>
<a href="update.jsp">Update a candidate info</a><br>
</body>
</html>