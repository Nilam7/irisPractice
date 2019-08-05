<%@page import="java.util.List,com.iris.models.Product" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



	
	<table>
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product description</th>
		
		</tr>
		<c:forEach items="${eList}" var="e">
			<tr>
				<td>${e.pid}</td>
				<td>${e.pname}</td>
				<td>${e.pprice}</td>
				
				<td>${e.pdescrition}</td>
				
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
