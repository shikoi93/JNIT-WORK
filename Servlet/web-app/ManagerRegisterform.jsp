
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<body bgcolor="wheat">
<style>

body
{

	border-style: solid;
	border-color: coral;
	border-width: 400px;
	border-height: 80px;
	background-color:"wheat";
</style>
<table>
</head>

<h2>Manager Registration</h2>
<form action="./ManagerRegister.jsp" method="post">
<tr>
<td><input type="hidden" name="mid"></td>
</tr>

<tr>
<td>Username: </td>
<td><input type="text" name="user"></td>
</tr>

<tr>
<td>Password: </td>
<td><input type="password" name="pass"></td>
</tr>

<tr>
<td>Email: </td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>Phone: </td>
<td><input type="text" name="phone"></td>
</tr>

<tr>
<td>Department: </td>
<td><input type="text" name="department"></td>
</tr>

<tr>
<td><input type="hidden" name="leavedays"></td>
</tr>


<tr>
<td align="center"><input type="submit" value="Register"></td>
</tr>


</form>
</table>
</body>
</html>