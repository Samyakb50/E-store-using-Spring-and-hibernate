<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/images11/favicon.png">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap11/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/resources/js11/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/resources/bootstrap11/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css11/overall.css">
</head>

<body>
<nav class="navbar navbar-inverse">
    <div  class="container-fluid">
        <div class="navbar">
            <img src="${pageContext.request.contextPath}/resources/images11/logo.png" width="210px" height="130px" alt="logo-image"/>
        </div>

        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-left">
                <li><a href=" <c:url value="/admin/dashboard" />">Home</a></li>
                <li><a href=" <c:url value="/product/showFormForAdd" />">Add Item</a></li>
                <li><a href=" <c:url value="/admin/list" />">List Item</a></li>
                <li><a href=" <c:url value="/admin/list" />">Update Item</a></li>
                <li><a href=" <c:url value="/admin/list" />">Delete Item</a></li>
                <li><a href=" <c:url value="/order/orderList" />">Orders</a></li>
                
            </ul>
			<ul class="nav navbar-nav navbar-right">
                    <li><a href="<c:url value="/home" />"><span
                            class="glyphicon glyphicon-log-in"></span> Logout</a></li>
            </ul>
        </div>
    </div>
</nav>


</body>
</html>