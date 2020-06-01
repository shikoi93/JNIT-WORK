<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<style>

body
{
	border-style: solid;
	border-color: coral;
	border-width: 100px;
	border-height: 80px;
	background-color:"wheat";


</style>
</head>


<body bgcolor="wheat">
<h1>My Profile</h1>
<table>
<tr>
<td><a href="employee_home.jsp">Employee Home</a> &nbsp;&nbsp;</td>
<td><a href = "index.html">Logout</a>&nbsp;&nbsp;&nbsp;&nbsp;</td> 
</tr>
</table>

<table align="center" width="600" border="2">
<tr>
<td>Eid</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>Department</td>
<td>Leave Days</td>
<td>Action</td>
</tr>





<%@page import="java.sql.*" %>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/university";
String username = "root";
String password = "root";
Connection con=DriverManager.getConnection(url,username,password);

Object ob=session.getAttribute("id");
int id=(Integer)ob;

String user=request.getParameter("user");
String pass=request.getParameter("pass");



PreparedStatement ps=con.prepareStatement("select * from employee where eid=?");
ps.setInt(1,id);


ResultSet rs=ps.executeQuery();

while(rs.next()) 
{
%>
<tr>
<td><%=rs.getInt("eid")%></td>
<td><%=rs.getString("username")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getLong("phone")%></td>
<td><%=rs.getString("department")%></td>
<td><%=rs.getInt("leavedays")%></td>
<td><a href="Employee_update.jsp?id=<%=rs.getInt("eid")%>">Update</a></td>


</tr>

<%
}
%>
</table>

</body>
</html>