<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="header.jsp"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="grey">
<feildset align=center>
<legend>Employee</legend>
<h3>Welcome ${userObj.first_name}</h3><br>
<div align=center>
<a href="viewprofile">1.View Profile</a><br>
<a href="changepassword.jsp">2.Change Password</a><br>
</div>


</feildset>
</body>
</html>