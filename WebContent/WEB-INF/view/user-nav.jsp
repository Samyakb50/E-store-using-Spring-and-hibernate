<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="description" content="Fashi Template">
    <meta name="keywords" content="Fashi, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Insert title here</title>
	<link href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap" rel="stylesheet">

    <!-- Css Styles -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/themify-icons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/nice-select.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css6/style.css" type="text/css">
</head>
<body>
	<header class="header-section">
        <div class="header-top">
            
        </div>
        <div class="container">
            <div class="inner-header">
                <div class="row">
                    <div class="col-lg-2 col-md-2">
                        <div class="logo">
                            <a href="./index.html">
                                <img src="${pageContext.request.contextPath}/resources/img6/logo.png" alt="">
                            </a>
                        </div>
                    </div>
                    <div class="col-lg-7 col-md-7">
                        <div class="advanced-search">
                            <button type="button" class="category-btn">All Categories</button>
                            <div class="input-group">
                                <input type="text" placeholder="What do you need?">
                                <button type="button"><i class="ti-search"></i></button>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 text-right col-md-3">
                        <ul class="nav-right">
                            <li class="heart-icon">
                                <a href="${pageContext.request.contextPath}/cart/list">
                                    <i class="fa fa-shopping-cart fa-fw"></i>
                                </a>
                            </li>
                            <li class="heart-icon">
                                <a href="${pageContext.request.contextPath}/customer/signout">
                                    <i class="fa fa-sign-out fa-fw"></i>
                                    
                                </a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="nav-item">
            <div class="container">
                <div class="nav-depart">
                    <div class="depart-btn">
                        <i class="ti-menu"></i>
                        <span>All departments</span>
                        <ul class="depart-hover">
                            <li class="active"><a href="${pageContext.request.contextPath}/product/list/Womens">Womens Clothing</a></li>
                            
                            <li><a href="${pageContext.request.contextPath}/product/list/Mens">Mens Clothing</a></li>
                            
                            <li><a href="${pageContext.request.contextPath}/product/list/Kids">Kids Clothing</a></li>
                        </ul>
                    </div>
                </div>
                <nav class="nav-menu mobile-menu">
                    <ul>
                        <li class="active"><a href="${pageContext.request.contextPath}/cart/show">Home</a></li>
                        <li><a href="${pageContext.request.contextPath}/product/list">All Products</a></li>
                       
                        <li><a href="${pageContext.request.contextPath}/cart/list">Cart</a></li>
                       
                        
                    </ul>
                </nav>
                <div id="mobile-menu-wrap"></div>
            </div>
        </div>
    </header>
    <script src="${pageContext.request.contextPath}/resources/js6/jquery-3.3.1.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/bootstrap.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/jquery-ui.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/jquery.countdown.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/jquery.nice-select.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/jquery.zoom.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/jquery.dd.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/jquery.slicknav.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/owl.carousel.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js6/main.js"></script>
</body>
</html>