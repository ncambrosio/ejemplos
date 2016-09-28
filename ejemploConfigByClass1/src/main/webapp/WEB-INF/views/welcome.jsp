<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>AngularJS $http Example</title>  
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  </head>
  <body>
		<div class="generic-container">
      		<h1>Bienvenido!!!!</h1>
		</div>
		<div>
		<%
		  java.util.Enumeration<String> sessEnum = request.getSession().getAttributeNames();
		  while (sessEnum.hasMoreElements()) {
			String s = sessEnum.nextElement();
			out.println(s + "==" + request.getSession().getAttribute(s));
			out.println("");
		  }
		%>
		</div>
  </body>
</html>