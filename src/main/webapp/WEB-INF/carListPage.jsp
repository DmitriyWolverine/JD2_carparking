<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Car List</title>
</head>
<body>
	<p>CARS LIST!</p>
	<c:forEach items="${list}" var="item">
		<p><c:out value="${item}"/>
		<form action="MainServlet" method="post">
			<input type="hidden" name="command" value="to_book_car"/>
			<input type="hidden" name="id" value="${item.getId()}"/>
			<input type="submit" value="Book"/>
		</form>
		</p>
		<form action="MainServlet" method="post">
			<input type="hidden" name="command" value="to_update_car"/>
			<input type="hidden" name="id" value="${item.getId()}"/>
			<input type="submit" value="Update"/>
		</form>
		<form action="MainServlet" method="post">
			<input type="hidden" name="command" value="delete_car"/>
			<input type="hidden" name="id" value="${item.getId()}"/>
			<input type="submit" value="Delete"/>
		</form>
	</c:forEach> 
</body>
</html>