<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Myerror.jsp"%>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jstl Demo</title>
</head>
<body>
	Name: <c:out value="${sessionScope.name }"/><br>

	Designation: <c:out value="${sessionScope.designation }"/><br>

		EmployeerName: <c:out value="${applicationScope.employeername }"/><br>

		Biscuit Preferences:<c:out value="${cookie.biscuit.value }"/><br>

					<c:forTokens items="Ragini,Nilam,Priyanka,Sagnicka" delims="," var="gname">
	 								<br/> <c:out value="${fn:toUpperCase(gname)}"/>	<br>	
	 					</c:forTokens>
	 
				 <br/>
				 				
	 
</body>
</html>