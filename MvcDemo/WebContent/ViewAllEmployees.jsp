<%@page import="java.util.List,com.iris.practice.classes.Employee" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"/>

	
	<table>
		<tr>
			<th>Emp Id</th>
			<th>Emp pass</th>
			
			<th>Emp fName</th>
			<th>Emp lname</th>
			<th>Gender</th>
			
			<th>Qualification</th>
			<th>Role</th>
		</tr>
		<c:forEach items="${eList}" var="e">
			<tr>
				<td>${e.id}</td>
				<td>${e.pass}</td>
				
				<td>${e.fname}</td>
					<td>${e.lname}</td>
				<td>${e.gender}</td>
				
				<td>${e.q}</td>
					<td>${e.role}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
