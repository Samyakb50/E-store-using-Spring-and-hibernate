<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!-- 	navigation Bar -->
<%@ include file="/WEB-INF/view/userNavbar.jsp"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Management</title>
<link rel="icon" type="image/x-icon" href="<c:url value="/resource/images/favicon.png"/>" />
<link rel="stylesheet" href="<c:url value="/resource/bootstrap/css/bootstrap.min.css"/>">
<script src="<c:url value="/resource/js/jquery.js"/>"></script>
<script src="<c:url value="/resource/bootstrap/js/bootstrap.min.js"/>"></script>
<link rel="stylesheet" type="text/css" href="<c:url value="/resource/css/ProductList.css"/>">
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script src="<c:url value="/resource/js/productController.js"/>"></script>
</head>
<body ng-app="myapp">
	<div class="container" id="productTable"
		style="width: 1145px; margin-bottom: 180px;">
		<h3>Cart</h3>
		<table class="table table-hover" id="productList">
			<thead>
				<tr>
					<th>Order Id</th>
					<th>Quantity</th>
					<th>Price</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="tempProduct" items="${cart}">
								<c:url var="deleteLink" value="/cart/delete">
						<c:param name="productId" value="${tempProduct.productId}" />
					</c:url>
					<tr>
						<td>${tempProduct.orderId}</td>
						<td>${tempProduct.quantity}</td>
						<td>${tempProduct.productPrice}</td>
						<td><a href="${deleteLink}" onClick="if (!(confirm('Are u sure'))) return false">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<center><input type="button" value="Checkout" onClick="window.location.href='checkout'; return false;" class="btn btn-success"/>
					</center>
	</div>
</body>
</html>