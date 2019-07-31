<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FILL form</title>
</head>
<body>
<form action="JstlDemo.jsp">
		Enter ur Email : <input type="text" name="email"><br/>
		Qualification : 
		<input type="checkbox" name="qualification" value="btech">B.Tech
		<input type="checkbox" name="qualification" value="mtech">M.Tech
		<input type="checkbox" name="qualification" value="mba">MBA
		<input type="checkbox" name="qualification" value="mca">MCA
		
		<br/>
		<input type="submit">
	</form>

</body>
</html>