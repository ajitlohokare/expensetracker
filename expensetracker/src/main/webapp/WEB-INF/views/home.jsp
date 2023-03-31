<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Expense tracker </h1>
<p>${message}</p>

<c:foreach var="expense" items="${expenses}">
<div>
	<h3>${expense.expensename}</h3>
	<p>&#8377;${expense.amount}</p>
</div>

</c:foreach>

</body>
</html>