<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Form</title>
</head>
<body>

<div align="center">
	<fieldset>
		<legend>${frmLabel}</legend>
		<f:form action="${pageContext.request.contextPath}/submitProduct" method="post" modelAttribute="pObj">
			<table>
				
				<tr>
					<td>Product Id : </td>
					<td><f:input type="text" path="productId" />
				</tr>
					
				
				<tr>
					<td>Product Name : </td>
					<td><f:input type="text" path="productName"/>
				</tr>
				<tr>
					<td>Product Desc : </td>
					<td><f:input type="text" path="prodesc"/>
				</tr>
				<tr>
					<td>Category : </td>
					<td>
						<f:select path="Cat_Id">
							<f:option value="none">---Select Category----</f:option>
							<c:forEach items="${categories}" var="cObj">
								<f:option value="${cObj.categoryId}">${cObj.categoryName}</f:option>
							</c:forEach>
						</f:select>
						
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="${btnLabel}">
					</td>
				</tr>
			</table>
		</f:form>
	</fieldset>
</div>
	
</body>
</html>