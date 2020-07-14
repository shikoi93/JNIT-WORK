<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel=stylesheet>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>


<body bgcolor="#fe9f86">
<br><br>
<br><br>
<table align = "center" bgcolor="coral" border="4" height="550" width="700">
<tr>
<td>

<table align = "center" bgcolor="wheat" border="3" height="350" width="550">
	<form:form action="/SpringValidationFormMVC/registerSuccess"
		method="post" modelAttribute="players">
		
<h3 align="right"><a href="/SpringValidationFormMVC">Back</a></h3>


		
		<u><h2 align="center">Players Registration Form</h2></u>
		
		
		<tr>
				<td>Enter FullName:</td>
				<td><form:input path="name"/></td>
				<td><form:errors path="name" cssClass="error"/></td>
			</tr>
			
			<tr>
				<td>Enter Password:</td>
				<td><form:password path="password"/></td>
				<td><form:errors path="password" cssClass="error"/></td>
			</tr>
			
			
	<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="Male" label="Male" />
					<form:radiobutton path="gender" value="Female" label="Female" />
					<form:radiobutton path="gender" value="Others" label="Others" /></td>
				<td><form:errors path="gender" cssClass="error" /></td>

			</tr>
			
			
			<tr>
			
				<td>Enter Email:</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			
			

			<tr>
				<td>Enter Phone Number:</td>
				<td><form:input path="phone"/></td>
				<td><form:errors path="phone" cssClass="error"/></td>
			</tr>
			
			
		<tr>
		<td>Enter Sport:</td>
		<td><form:input path="sport"/></td>
		<form:errors path="sport" cssClass="error"/></td>
		</tr>

<tr>
				<td>Enter Club:</td>
				<td><form:input path="club"/></td>
				<td><form:errors path="club" cssClass="error"/></td>

			</tr>
			

			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>

	</form:form>
	
</table>
</td>
</tr>

</table>

</body>
</html>