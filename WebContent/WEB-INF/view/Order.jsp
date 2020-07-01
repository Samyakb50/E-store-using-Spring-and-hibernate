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
<div class="limiter">
		<div class="container-table100">
			<div class="wrap-table100">
<div class="table100 ver5 m-b-110">
					<table data-vertable="ver5">
						<thead>
							<tr class="row100 head">
								<th class="column100 column1" data-column="column1">OrderId</th>
								<th class="column100 column2" data-column="column2">Date</th>
								<th class="column100 column3" data-column="column3">Total</th>
								<th class="column100 column4" data-column="column4">Status</th>
								<th class="column100 column5" data-column="column5">Action</th>
								
								
							</tr>
						</thead>
						
						<tbody>
							<c:forEach var="tempProduct" items="${products}">
							<c:url var="updateLink" value="/order/changeStatus">
						<c:param name="oid" value="${tempProduct.orderId}" />
						<c:param name="status" value="${tempProduct.status}" />
						
						</c:url>
							<tr class="row100">
								<td class="column100 column1" data-column="column1">${tempProduct.orderId}</td>
								<td class="column100 column2" data-column="column2">${tempProduct.date}</td>
								<td class="column100 column3" data-column="column3">${tempProduct.total}</td>
								<td class="column100 column4" data-column="column4">${tempProduct.status}</td>
								
								<td class="column100 column5" data-column="column5"><a href="${updateLink}">Update</a>	
							</tr>
						</c:forEach>
							
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
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