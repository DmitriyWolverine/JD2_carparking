<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>start page</title>
</head>

<body>
	Hello User!
		<form action="MainServlet" method="post">
			<input type="hidden" name="command" value="show_cars"/>
			<input type="submit" value="Show cars list"/>
		</form>
		<form action="MainServlet" method="post">
			<label>Brand:<input type="text" name="brand" size="25" maxlength="100" >	</label>
			<label>model:<input type="text" name="model" size="25" maxlength="100" > </label>
			<input type="hidden" name="command" value="create_car"/>
			<input type="submit" value="Create car"/>
		</form>
		
		<c:out value="${order_msg}"/>
</body>

</html>