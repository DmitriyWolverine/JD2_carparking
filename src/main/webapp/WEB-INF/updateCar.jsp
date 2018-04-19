<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update book</title>
</head>
<body>
		<form action="MainServlet" method="post">
			<label>Brand:<input type="text" name="brand" size="25" maxlength="100" > </label>
			<label>model:<input type="text" name="model" size="25" maxlength="100" > </label>
			<input type="hidden" name="command" value="update_car"/>
			<input type="submit" value="Update car"/>
		</form>
</body>
</html>