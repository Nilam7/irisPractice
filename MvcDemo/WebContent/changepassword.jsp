<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="header.jsp"></jsp:include>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>update password</title>
</head>
<body>
<form action="changepassword" method="post">
<label>Enter employee id</label><br>
<input type="text" name="id"><br>
<label>Current password</label><br>
<input type="text" name="pass"><br>
<label>new password</label><br>
<input type="text" name="pass1"><br>
<input type="submit" value="submit">

</form>

</body>
</html>