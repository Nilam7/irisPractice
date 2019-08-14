<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Category</title>
</head>
<body>

<table border="1">

		<tr>
		<th>Category id</th>
		<th>CategoryName</th>
		<th>Category Description</th>
		<th colspan="2">Admin Operations</th>
		</tr>
		

		<c:forEach var="category" items="${categories}" >
			<tr>
				
			
				<td>${category.categoryId}</td>
				<td>${category.categoryName}</td>
				<td>${category.description}</td>
				<td><a href="${pageContext.request.contextPath}/updateCategory/${category.categoryId}">Update</a></td>
				<td><a href="${pageContext.request.contextPath}/deleteCategory/${category.categoryId}">Delete</a></td>
				
		

			</tr>
		</c:forEach>
	</table>

   </body>
   
</html>

</html>