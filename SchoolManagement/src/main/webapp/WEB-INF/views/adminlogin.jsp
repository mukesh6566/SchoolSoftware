<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="../admin/login" method="post">
Email:<input type="email" name="email" value=""/><br>
Password:<input type="password" name="pass" value=""/><br>
<input type="submit" value="submit"/>

</form:form>
</body>
</html>