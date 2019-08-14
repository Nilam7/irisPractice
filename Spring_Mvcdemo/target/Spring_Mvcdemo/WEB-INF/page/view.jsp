<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Category</title>
</head>
<body>
<table border="1">

		<th>Category id</th>
		<th>CategotyName</th>
		

		<c:forEach var="cat" items="${listEmp}" varStatus="status">
			<tr>
				
				<td>${cat.categoryId}</td>
				<td>${cat.categoryName}</td>
			

			</tr>
		</c:forEach>
	</table>

   </body>
   
</html>

</html>