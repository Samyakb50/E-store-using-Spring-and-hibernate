<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/images3/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor3/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts3/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts3/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor3/animate/animate.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor3/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor3/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor3/select2/select2.min.css">
<!--===============================================================================================-->	
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor3/daterangepicker/daterangepicker.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css3/util.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css3/main.css">
</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-form-title" style="background-image: url(${pageContext.request.contextPath}/resources/images3/bg-01.jpg);">
					<span class="login100-form-title-1">
						Sign In
					</span>
				</div>

				<form:form action="saveCustomer" modelAttribute="customer" method="POST" class="login100-form validate-form">
					<div class="wrap-input100 validate-input m-b-26" data-validate="Username is required">
						<span class="label-input100">Name</span>
						<form:input path="customerName" class="input100" ></form:input>
						<span class="focus-input100"></span>
					</div>

					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Email</span>
						<form:input path="customerEmail" class="input100" ></form:input>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Phone number</span>
						<form:input path="customerPhone" class="input100" ></form:input>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Address</span>
						<form:input path="address" class="input100" ></form:input>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Username</span>
						<form:input path="username" class="input100"></form:input>
						<span class="focus-input100"></span>
					</div>
					<div class="wrap-input100 validate-input m-b-18" data-validate = "Password is required">
						<span class="label-input100">Password</span>
						<form:input path="password" class="input100" ></form:input>
						<span class="focus-input100"></span>
					</div>
					
	
					<div class="container-login100-form-btn">
						<input type="submit"  class="submit" name="submit" id="submit" class="login100-form-btn"/>
					</div>
				</form:form>
			</div>
		</div>
	</div>
	
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor3/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor3/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor3/bootstrap/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor3/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor3/select2/select2.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor3/daterangepicker/moment.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor3/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor3/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/js3/main.js"></script>
</body>
</html>