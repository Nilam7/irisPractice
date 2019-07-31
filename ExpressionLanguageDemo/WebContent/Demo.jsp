<%@taglib prefix="s" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>hello</title>
</head>
<body>


<s:set var="sp" value="java" scope="page"/>

Name              :  ${sessionScope.name}<br>
Designation       : ${sessionScope.designation }<br>
EmployeerName     :${applicationScope.employeername }<br>
BiscuitPreferances:${cookie.biscuit.value }<br>


Email: ${param.email}<br>

<br>
Qualifications:
<s:forEach begin="0" end="3" var="i">
${paramValues.qualification[i]}
</s:forEach></br>

Specialization:${pageScope.sp}<br>


</body>
</html>