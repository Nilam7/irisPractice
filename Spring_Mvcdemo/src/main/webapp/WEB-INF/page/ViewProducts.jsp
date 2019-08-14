<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Form</title>
</head>
<body>

<div align="center">

	
	<h1>View Products</h1>
	<table border="1">
		<tr>
			<th>Product Name</th>
			<th>Product Desc</th>
			<th colspan="2">Admin Operations</th>
		</tr>
		<c:forEach items="${products}" var="p">	
			<tr>
				<td>${p.productName}</td>
				<td>${p.prodesc }</td>
				<td><a href="updateProduct/${p.productId}">Update</a></td>
				<td><a href="deleteProduct/${p.productId}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
	
</body>
</html>