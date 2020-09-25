<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Temp Converter</title>
</head>
<body>
	<h1>Temperature Converter</h1>
	<form action = "getTempServletC" method = "post">
		Enter your current temperature in C:
		<input type = "text" name = "userTempC" size = "3">
		<input type = "submit" value = "Calculate F" />
	</form>
</body>
</html>