<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM</h2>
		</div>
	</div>
	<div id="container">
		<form:form action="saveProduct" modelAttribute="product" method="POST">
			<!--  need to associate this data with customer id -->
			<form:hidden path="productId" /> <!-- used for backend -->
			<table>
			<tr>
				<td><label>ProductName:</label></td>
				<td><form:input path="productName"/></td>
			</tr>
			<tr>
				<td><label>ProductCategory:</label></td>
				<td><form:input path="productCategory"/></td>
			</tr>		
			<tr>
				<td><label>ProductDescription:</label></td>
				<td><form:input path="productDescription"/></td>
			</tr>
			<tr>
				<td><label>ProductPrice:</label></td>
				<td><form:input path="productPrice"/></td>
			</tr>
			<tr>
				<td><label>ProductStatus:</label></td>
				<td><form:input path="productStatus"/></td>
			</tr>
			<tr>
				<td><label>UnitInStock:</label></td>
				<td><form:input path="unitInStock"/></td>
			</tr>
			<tr>
				<td><label>ProductManufacturer:</label></td>
				<td><form:input path="productManufacturer"/></td>
			</tr>
			<tr>
				<td><label>ProductImage:</label></td>
				<td><form:input path="productImage"/></td>
			</tr>	
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" /></td>
			</tr>	
			</table>
		</form:form>
		<div style="clear; both;"></div>
		<p>
			<a href="${pageContext.request.contextPath}/product/list">Back to list</a>
	</div>
</body>
</html>