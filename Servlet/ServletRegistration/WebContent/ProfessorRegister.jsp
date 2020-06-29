

<!DOCTYPE html>
<html>

<body bgcolor="wheat">
<style>
body
{
	border-style: solid;
	border-color: coral;
	border-width: 300px;
	border-height: 80px;
	background-color:"wheat";
</style>

</head>
<h2 align="center">Professor Registration</h2>
<form action="./professorRegister" method="post">
<table align="center" width="200" height="100">


<tr>
<td>Professor ID:</td>
<td><input type="text" name="pid" required>
</tr>


<tr>
<td>Full Name: </td>
<td><input type="text" name="fullName" required></td>
</tr>

<tr>
<td>Password: </td>
<td><input type="password" name="password" required></td>
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
<td>Department: </td>
<td><input type="text" name="department"></td>
</tr>

<tr>
<td align="center"><input type="submit" value="Register"></td>
</tr>

</form>
</table>
</body>
</html>
