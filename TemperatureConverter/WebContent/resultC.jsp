<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<title>Results</title>
</head>
<body>
<p>
${userTempC.getTemp()} C converts to <br />
${userTempC.getNewTemp()} F <br />
</p>
<a href="index.jsp">Back to the start!</a>
</html>