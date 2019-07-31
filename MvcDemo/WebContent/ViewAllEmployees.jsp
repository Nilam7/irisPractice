<%@page import="java.util.List,com.iris.practice.classes.Employee" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="header.jsp"/>

	<body bgcolor="cyan">
	<table align="center">
		<tr>
			<th>EmpId</th>
			<th>Emppass</th>
			
			<th>EmpfName</th>
			<th>Emplname</th>
			<th>Gender</th>
			<th>Qualification</th>
			<th>Role</th>
		</tr>
		<c:forEach items="${eList}" var="e">
			<tr>
				<td>${e.employeeId}</td>
				<td>${e.password}</td>
				
				<td>${e.first_name}</td>
					<td>${e.last_name}</td>
				<td>${e.gender}</td>
				
				<td>${e.qulalification}</td>
					<td>${e.role}</td>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
