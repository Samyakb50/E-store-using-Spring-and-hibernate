<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
</style>
</head>
<body class="w3-light-grey">
	<div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
  <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
  <span class="w3-bar-item w3-right">Fashi</span>
</div>

<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidebar"><br>
  <div class="w3-container w3-row">
    <div class="w3-col s4">
      <img src="${pageContext.request.contextPath}/resources/w3images/avatar2.png" class="w3-circle w3-margin-right" style="width:46px">
    </div>
    <div class="w3-col s8 w3-bar">
      <span>Welcome, <strong>Sir</strong></span><br>
      <a href="#" class="w3-bar-item w3-button"><i class="fa fa-envelope"></i></a>
      <a href="#" class="w3-bar-item w3-button"><i class="fa fa-user"></i></a>
      <a href="#" class="w3-bar-item w3-button"><i class="fa fa-cog"></i></a>
    </div>
  </div>
  <hr>
  <div class="w3-container">
    <h5>Dashboard</h5>
  </div>
  <div class="w3-bar-block">
    <a href="#" class="w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black" onclick="w3_close()" title="close menu"><i class="fa fa-remove fa-fw"></i>  Close Menu</a>
    <a href="${pageContext.request.contextPath}/admin/dashboard" class="w3-bar-item w3-button w3-padding w3-blue"><i class="fa fa-users fa-fw"></i>  Overview</a>
    <a href="${pageContext.request.contextPath}/product/showFormForAdd" class="w3-bar-item w3-button w3-padding"><i class="fa fa-plus fa-fw"></i>  Add Item</a>
    <a href="${pageContext.request.contextPath}/admin/list" class="w3-bar-item w3-button w3-padding"><i class="fa fa-list fa-fw"></i>  List Item</a>
    <a href="${pageContext.request.contextPath}/admin/list" class="w3-bar-item w3-button w3-padding"><i class="fa fa-edit fa-fw"></i>  Update Item</a>
    <a href="${pageContext.request.contextPath}/admin/list" class="w3-bar-item w3-button w3-padding"><i class="fa fa-trash fa-fw"></i>  Delete Item</a>
     <a href="${pageContext.request.contextPath}/order/orderList" class="w3-bar-item w3-button w3-padding"><i class="fa fa-diamond fa-fw"></i>  Orders</a>
    <a href="${pageContext.request.contextPath}/home" class="w3-bar-item w3-button w3-padding"><i class="fa fa-sign-out fa-fw"></i>  Signout</a>
    
  </div>
</nav>


<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">

  <!-- Header -->
  <header class="w3-container" style="padding-top:22px">
    <h5><b><i class="fa fa-dashboard"></i> My Dashboard</b></h5>
  </header>

  <div class="w3-row-padding w3-margin-bottom">
    <div class="w3-quarter">
      <div class="w3-container w3-red w3-padding-16">
        <div class="w3-left"><i class="fa fa-gift w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>52</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Products</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-blue w3-padding-16">
        <div class="w3-left"><i class="fa fa-users w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>99</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Users</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-teal w3-padding-16">
        <div class="w3-left"><i class="fa fa-list w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>23</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Orders</h4>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-orange w3-text-white w3-padding-16">
        <div class="w3-left"><i class="fa fa-truck w3-xxxlarge"></i></div>
        <div class="w3-right">
          <h3>50</h3>
        </div>
        <div class="w3-clear"></div>
        <h4>Delivered</h4>
      </div>
    </div>
  </div>

  
  <hr>

  
  <hr>
  <div class="w3-container">
    <h5>Recent Users</h5>
    <ul class="w3-ul w3-card-4 w3-white">
      <li class="w3-padding-16">
        <img src="${pageContext.request.contextPath}/resources/w3images/avatar2.png" class="w3-left w3-circle w3-margin-right" style="width:35px">
        <span class="w3-xlarge">Mike</span><br>
      </li>
      <li class="w3-padding-16">
        <img src="${pageContext.request.contextPath}/resources/w3images/avatar5.png" class="w3-left w3-circle w3-margin-right" style="width:35px">
        <span class="w3-xlarge">Jill</span><br>
      </li>
      <li class="w3-padding-16">
        <img src="${pageContext.request.contextPath}/resources/w3images/avatar6.png" class="w3-left w3-circle w3-margin-right" style="width:35px">
        <span class="w3-xlarge">Jane</span><br>
      </li>
    </ul>
  </div>
  <hr>

  <div class="w3-container">
    <h5>Recent Comments</h5>
    <div class="w3-row">
      <div class="w3-col m2 text-center">
        <img class="w3-circle" src="${pageContext.request.contextPath}/resources/w3images/avatar3.png" style="width:96px;height:96px">
      </div>
      <div class="w3-col m10 w3-container">
        <h4>John <span class="w3-opacity w3-medium">Sep 29, 2014, 9:12 PM</span></h4>
        <p>Keep up the GREAT work! I am cheering for you!! Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><br>
      </div>
    </div>

    <div class="w3-row">
      <div class="w3-col m2 text-center">
        <img class="w3-circle" src="${pageContext.request.contextPath}/resources/w3images/avatar1.png" style="width:96px;height:96px">
      </div>
      <div class="w3-col m10 w3-container">
        <h4>Bo <span class="w3-opacity w3-medium">Sep 28, 2014, 10:15 PM</span></h4>
        <p>Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p><br>
      </div>
    </div>
  </div>
  <br>
  <div class="w3-container w3-dark-grey w3-padding-32">
    <div class="w3-row">
      <div class="w3-container w3-third">
        <h5 class="w3-bottombar w3-border-green">Demographic</h5>
        <p>Language</p>
        <p>Country</p>
        <p>City</p>
      </div>
      <div class="w3-container w3-third">
        <h5 class="w3-bottombar w3-border-red">System</h5>
        <p>Browser</p>
        <p>OS</p>
        <p>More</p>
      </div>
      <div class="w3-container w3-third">
        <h5 class="w3-bottombar w3-border-orange">Target</h5>
        <p>Users</p>
        <p>Active</p>
        <p>Geo</p>
        <p>Interests</p>
      </div>
    </div>
  </div>

  <!-- Footer -->
  

  <!-- End page content -->
</div>

<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>
</body>
</html>