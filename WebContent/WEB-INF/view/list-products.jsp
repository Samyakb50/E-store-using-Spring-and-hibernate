<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/images2/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor2/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts2/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor2/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor2/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor2/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css2/util.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css2/main.css">
</head>
<body>
	<center><input type="button" value="Add product" onClick="window.location.href='showFormForAdd'; return false;" class="btn btn-success"/>
	</center>
	<br>
	<br>
	<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
<div class="table100 ver5 m-b-110">
					<table data-vertable="ver5">
						<thead>
							<tr class="row100 head">
								<th class="column100 column1" data-column="column1">Product Name</th>
								<th class="column100 column2" data-column="column2">Product Category</th>
								<th class="column100 column3" data-column="column3">Product Description</th>
								<th class="column100 column4" data-column="column4">Price</th>
								<th class="column100 column5" data-column="column5">Status</th>
								<th class="column100 column6" data-column="column6">UnitInStock</th>
								<th class="column100 column7" data-column="column7">Manufacturer</th>
								<th class="column100 column8" data-column="column8">Action</th>
								
							</tr>
						</thead>
						
						<tbody>
							<c:forEach var="tempProduct" items="${products}">
					<c:url var="updateLink" value="/product/showFormForUpdate">
						<c:param name="productId" value="${tempProduct.productId}" />
					</c:url>
					<c:url var="deleteLink" value="/product/delete">
						<c:param name="productId" value="${tempProduct.productId}" />
					</c:url>
							<tr class="row100">
								<td class="column100 column1" data-column="column1">${tempProduct.productName}</td>
								<td class="column100 column2" data-column="column2">${tempProduct.productCategory}</td>
								<td class="column100 column3" data-column="column3">${tempProduct.productDescription}</td>
								<td class="column100 column4" data-column="column4">${tempProduct.productPrice}</td>
								<td class="column100 column5" data-column="column5">${tempProduct.productStatus}</td>
								<td class="column100 column6" data-column="column6">${tempProduct.unitInStock}</td>
								<td class="column100 column7" data-column="column7">${tempProduct.productManufacturer}</td>
								<td class="column100 column8" data-column="column8"><a href="${updateLink}">Update</a>
						|
						<a href="${deleteLink}" onClick="if (!(confirm('Are u sure'))) return false">Delete</a></td>
								
							</tr>
						</c:forEach>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


	

<!--===============================================================================================-->	
	<script src="${pageContext.request.contextPath}/resources/vendor2/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor2/bootstrap/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor2/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor2/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/js2/main.js"></script>
</body>
</html>