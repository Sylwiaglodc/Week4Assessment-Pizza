<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Week 4 assessment - Pizza order app -- thank you page</title>
	</head>
	<body>
		<header>
		<h1>Thank you for placing your order. You're pizza is being made and will be delivered with 60 minutes</h1>
		</header>
	
	<p> You will be charged: $${userPizzaOrder}.00 on your credit card.</p>
	
	<a href="order.jsp">Submit another order</a>
	</body>
</html>