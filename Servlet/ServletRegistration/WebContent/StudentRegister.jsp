

<!DOCTYPE html>
<html>

<body bgcolor="wheat">
<style>
body
{
	border-style: solid;
	border-color: coral;
	border-width: 200px;
	border-height: 80px;
	background-color:"wheat";
</style>
</head>
<h2 align="center">Student Registration</h2>
<form action="./StudentLogin.jsp" method="post">
<table align="center" width="100" height=100">
<tr>
<td><input type="hidden" name="mid"></td>
</tr>

<tr>
<td>Student ID:</td>
<td><input type="text" name="studentid" required></td>

<tr>
<td>Full Name: </td>
<td><input type="text" name="user" length="50" required></td>
</tr>

<tr>
<td>Password: </td>
<td><input type="password" name="pass" required></td>
</tr>

<tr>
<td>Email: </td>
<td><input type="text" name="email" required></td>
</tr>

<tr>
<td>Phone: </td>
<td><input type="text" name="phone" required></td>
</tr>

<tr>
<td>Major: </td>
<td><input type="text" name="major" required></td>
</tr>


<tr>
<td align="center"><input type="submit" value="Register"></td>
</tr>

</form>
</table>
</body>
</html>
