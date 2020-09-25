<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<title>Results</title>
</head>
<body>
<p>
${userCoinPouch.getCents()} cents contains the following: <br />
${userCoinPouch.getDollars()} dollars <br />
${userCoinPouch.getQuarters()} quarters <br />
${userCoinPouch.getDimes()} dimes <br />
${userCoinPouch.getNickels()} nickels <br />
${userCoinPouch.getPennies()} pennies <br />
</p>
<a href="index.jsp">Select another amount of coins</a>
</html>