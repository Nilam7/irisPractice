<jsp:include page="Header.jsp"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


	<h4 style="color:red">
		<c:if test="${msg ne null}">
			${msg}
		</c:if>
	</h4>
	<fieldset>
		<legend>Login Form</legend>
		<form action="validate" method="post">	
			<table>
				<tr>
					<td>Employee Id : </td>
					<td>
						<input type="text" name="empid" placeholder="Enter your id" required/>
					</td>
				</tr>
				<tr>
					<td>Password : </td>
					<td>
						<input type="password" name="emppass" placeholder="Enter your password" required/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="Login"/>
 					</td>
				</tr>
			</table>
		</form>
	</fieldset>
	
	</div>

</body>
</html>
