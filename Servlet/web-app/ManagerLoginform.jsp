
<!DOCTYPE html>
<html>
<body bgcolor="wheat">
<style>
body {
border-style: solid;
	border-color: coral;
	border-width: 100px;
	border-height: 80px;
	background-color:"wheat";
</style>

<h1 align="center">Manager Login</h1>

<form action="./manager_login.jsp" method="post">
<table align="center" width="200" height="100">
<tr>
<td>Username:</td>
<td><input type="text" name="user"></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="password" name="pass">
</td>
</tr>

<tr>
<td><input type="submit" value="Login"></td>
</tr>
</table>
</form>
</body>
</html>