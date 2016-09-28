<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>AngularJS $http Example</title>  
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  </head>
  <body>
  <h1>Post session page</h1>
      <div class="generic-container">
		<h3>Atributos de la request</h3>
		<%
			java.util.Enumeration<String> reqEnum = request.getAttributeNames();
			while (reqEnum.hasMoreElements()) {
				String s = reqEnum.nextElement();
				if (s.compareToIgnoreCase("myUserSession") == 0) {
					out.println(s + " == " + request.getAttribute(s));
				}
			}
		%>
      </div>
      <h3>Atributos de la sesión</h3>
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