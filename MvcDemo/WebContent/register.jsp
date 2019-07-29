<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>

</head>
<body>
<form action="register" method="post">
<label>FirstName</label><br>
<input type="text" name="fname"><br>
<label>Gender</label><br>
<input type="text" name="gender"><br>
<label>Qualification</label><br>
<input type="text" name="q"><br>
<input type="submit" value="submit">

</form>

</body>
</html>