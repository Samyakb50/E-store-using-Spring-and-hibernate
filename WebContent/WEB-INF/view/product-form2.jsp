<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
	<div class="main">
        <div class="container">
            <div class="signup-content">
                <div class="signup-img">
                    <img src="${pageContext.request.contextPath}/resources/images/signup-img.jpg" alt="">
                </div>
                <div class="signup-form">
                    <form:form action="saveProduct" modelAttribute="product" method="POST" class="register-form" id="register-form">
                        <h2>Product form</h2>
                        	<form:hidden path="productId" />
                            <div class="form-group">
                                <label >Name :</label>
                                <form:input path="productName" />
                            </div>
                            <div class="form-group">
                                <label >ProductCategory :</label>
                                <form:input path="productCategory" />
                            </div>
                       
                        <div class="form-group">
                            <label >ProductDescription :</label>
                            <form:input path="productDescription" />
                        </div>
                        <div class="form-group">
                            <label >ProductPrice :</label>
                            <form:input path="productPrice" />
                        </div>
                        <div class="form-group">
                            <label >ProductStatus :</label>
                            <form:input path="productStatus" />
                        </div>
                        <div class="form-group">
                            <label >UnitInStock :</label>
                            <form:input path="unitInStock" />
                        </div>
                        <div class="form-group">
                            <label >ProductManufacturer :</label>
                            <form:input path="productManufacturer" />
                        </div>
                        <div class="form-group">
                            <label >ProductImage :</label>
                            <form:input path="productImage" />
                        </div>

         
                        <div class="form-submit">
                            <input type="reset" value="Reset All" class="submit" name="reset" id="reset" />
                            <input type="submit" value="Submit Form" class="submit" name="submit" id="submit" />
                        </div>
                    </form:form>
                </div>
            </div>
        </div>

    </div>

    <!-- JS -->
    <script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>
</html>