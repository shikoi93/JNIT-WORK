<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<body bgcolor="#fe9f86">
<br><br>
<br><br>
<table align = "center" bgcolor="coral" border="4" height="350" width="450">
<tr>
<td>

<table align = "center" bgcolor="wheat" border="3" height="150" width="300">
	<form:form action="/SpringValidationFormMVC/loginSuccess" method="post" modelAttribute="playersCredential">

<u><h3 align="center">Welcome to players login page</h3></u>

<h4 align="right"><a href="/SpringValidationFormMVC">Back</a></h4>
			<tr>
				<td>Enter Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><form:password path="password"/></td>
				<td><form:errors path="password" cssClass="error"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form:form>
	</table>
	<br>
	<br>
	</td>
	</tr>
	</table>
	
	
</body>
</html>