<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Order Car</title>
</head>
<body>
	<p>CAR BOOKING LIST!</p>
	
	<form action="MainServlet" method="post">
		<c:out value="${carBrand}"/>
		<c:out value="${carModel}"/>
		
		From:<input type="date" name="From" />
		To:<input type="date" name="To" />
		<p align="left"><input type="hidden" name="action" value="book_Car"/></p>
		<p align="left"><input type="submit" value="Book"/>
	</form>
	
	
</body>
</html>