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
<fieldset align="center">
<legend>Login page</legend>
<table>
<form action="Validate" method="post" text-align=center>
<tr>
<td><label>Employeeid</label></td><br>
<td><input type="text" name="eid" placeholder="enter your employee id"></td>

</tr>
<tr>
<td><label>Password</label></td><br>
<td><input type="password" name="pass" placeholder="enter your password"></td>
</tr>
<tr>
<td>
<input type="submit" value="Login">
</td>
</tr>
</form>
</table>
<fieldset>

</body>
</html>