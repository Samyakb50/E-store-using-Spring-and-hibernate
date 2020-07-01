<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String p=null;
p=request.getParameter("page");
System.out.println(p);
response.sendRedirect(p);
%>
</body>
</html>