<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!-- 	navigation Bar -->

<%@ include file="adminNavbar.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Management</title>
<link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/images11/favicon.png">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap11/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js11/jquery.js"></script>
<script src="${pageContext.request.contextPath}/resources/bootstrap11/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css11/ProductList.css">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js11/productController.js"></script>
</head>
<body ng-app="myapp">
	<div class="container" id="productTable"
		style="width: 1145px; margin-bottom: 180px;">
		<h3>Items List</h3>
		<table class="table table-hover" id="productList">
			<thead>
				<tr>
					<th>Product Name</th>
					<th>Product Category</th>
					<th>Product Description</th>
					<th>Price</th>
					<th>Status</th>
					<th>UnitInStock</th>
					<th>Manufacturer</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tempProduct" items="${products}">
					<c:url var="updateLink" value="/product/update">
						<c:param name="productId" value="${tempProduct.productId}" />
					</c:url>
					<c:url var="deleteLink" value="/product/delete">
						<c:param name="productId" value="${tempProduct.productId}" />
					</c:url>
					<tr>
						<td>${tempProduct.productName}</td>
						<td>${tempProduct.productCategory}</td>
						<td>${tempProduct.productDescription}</td>
						<td>${tempProduct.productPrice}</td>
						<td>${tempProduct.productStatus}</td>
						<td>${tempProduct.unitInStock}</td>
						<td>${tempProduct.productManufacturer}</td>
						<td><a href="${updateLink}">Update</a>|<a href="${deleteLink}" onClick="if (!(confirm('Are u sure'))) return false">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>
</html>