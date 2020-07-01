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
		<form:form action="saveCustomer" modelAttribute="customer" method="POST">
			<!--  need to associate this data with customer id -->
			<form:hidden path="customerId" /> <!-- used for backend -->
			<table>
			<tr>
				<td><label>Full Name:</label></td>
				<td><form:input path="customerName"/></td>
			</tr>
			<tr>
				<td><label>Email:</label></td>
				<td><form:input path="customerEmail"/></td>
			</tr>		
			<tr>
				<td><label>Phone:</label></td>
				<td><form:input path="customerPhone"/></td>
			</tr>
			<tr>
				<td><label>Address:</label></td>
				<td><form:input path="address"/></td>
			</tr>
			<tr>
				<td><label>Username:</label></td>
				<td><form:input path="username"/></td>
			</tr>
			<tr>
				<td><label>Password:</label></td>
				<td><form:input path="password"/></td>
			</tr>	
			<tr>
				<td><label></label></td>
				<td><input type="submit" value="Save" /></td>
			</tr>	
			</table>
		</form:form>
		<div style="clear; both;"></div>
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back to list</a>
	</div>
</body>
</html>