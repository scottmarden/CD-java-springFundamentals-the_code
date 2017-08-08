<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="css/style.css">
		<title>Secret Code</title>
	</head>
	<body>	
		<div class="errors">
			<c:if test="${errors != null}">
				<p><c:out value="${errors}" /></p>
			</c:if>
		</div>
		<div id="code">
			<form action="code" method="POST">
				<label for="attempt">What is the code?</label>
				<input type="text" name="attempt">
				<button type="submit">Try Code</button>
			</form>
		</div>
	</body>
</html>