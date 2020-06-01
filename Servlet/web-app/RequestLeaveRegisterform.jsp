
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Leave Registration</title>
<style>
body {
border-style: solid;
	border-color: coral;
	border-width: 100px;
	border-height: 600px;
	background-color:"wheat";
</style>

</head>
<body bgcolor="wheat" align="center">

<h1>Leave Registration Page</h1>
<form action="./RequestLeave.jsp" method="post">
<table align="center" >
<tr>
<td><input type="hidden" name="mid"></td>
</tr>

<tr>
<td>Username: </td>
<td><input type="text" name="user"></td>
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
<td>Start Date: </td>
<td><input type="date" name="start_date"><td>
</tr>

<tr>
<td>End Date: </td>
<td><input type="date" name="end_date"></td>
</tr>

<tr>
<td>Reason for leave: </td>
<td><input type="text" width="600" height="600" name="reason_for_leave"></td>
</tr>


<tr>
<td><input type="hidden" name="leavedays"></td>
</tr>


<tr>
<td align="center"><input type="submit" value="Submit Request"></td>
</tr>

</table>
</form>
</body>
</html>