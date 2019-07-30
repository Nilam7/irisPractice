<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgrey">
<jsp:include page="header.jsp"></jsp:include>
<feildset align=center>
<legend border=2px>ADMIN</legend>
<h3> WELCOME ${userObj.first_name}</h3><br>
<div align=center>
<a href="register.jsp">1.Register a new Candidate</a><br>
<a href="view.jsp">2.View a Candidate</a><br>
<a href="Delete.jsp">3.Delete a  Candidate from database</a><br>
<a href="update.jsp">4.Update a candidate info</a><br>
<a href="viewall">5.view all employees in database</a>
</div>
</feildset>
</body>
</html>