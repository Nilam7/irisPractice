<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h1 align="center" >Category Form</h1>
<div align="center">
<form:form action="${pageContext.request.contextPath}/show" modelAttribute="cObj" method="POST">
<table>
<tr>
<td>Category Id : </td>
<td><form:input type="text" path="categoryId"/></td>
</tr>
<tr>
<td>Category Name : </td>
<td><form:input type="text" path="categoryName"/></td>
</tr>
<tr>
<td>Category description : </td>
<td><form:input type="text" path="description"/></td>
</tr>
<tr>
<td><input type="submit" value="${btnLabel}"/></td>
</tr>
</table>
</form:form>
</div>

</body>
</html>