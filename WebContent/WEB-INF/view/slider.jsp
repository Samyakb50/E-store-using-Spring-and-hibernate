<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/bootstrap11/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/resources/js11/jquery.js"></script>
<script src="${pageContext.request.contextPath}/resources/bootstrap11/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css11/overall.css">
	
</head>
<body>
	<!-- Slider -->
	<div class="jumbotron">
		<div class="container">
			<div id="myCarousel" class="carousel slide" data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
					<li data-target="#myCarousel" data-slide-to="1"></li>
					<li data-target="#myCarousel" data-slide-to="2"></li>
					<li data-target="#myCarousel" data-slide-to="3"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="${pageContext.request.contextPath}/resources/images11/shopping1.jpg" style="width:100%;" alt="Image1">
					</div>
					<div class="item">
						<img src="${pageContext.request.contextPath}/resources/images11/pixel.jpg" style="width:100%;" alt="Image2">
					</div>

					<div class="item">
						<img src="${pageContext.request.contextPath}/resources/images11/shopping.jpg" style="width:100%;" alt="Image3">
					</div>

					<div class="item">
						<img src="${pageContext.request.contextPath}/resources/images11/buy.jpg" style="width:100%;" alt="Image4">
					</div>
				</div>

				<!-- Left and right controls -->
				<a class="left carousel-control" href="#myCarousel" data-slide="prev">
					<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a>
				<a class="right carousel-control" href="#myCarousel" data-slide="next">
					<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>
		</div>
	</div>
</body>
</html>