<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Profile</title>

<style>

body
{
	border-style: solid;
	border-color: coral;
	border-width: 100px;
	border-height: 80px;
	background-color:"wheat";
}


</style>
</head>
<body bgcolor="wheat">
<h1>Leave Details</h1>
<table border="6"> <tr style="background-color:wheat"><td><a href = "index.html">Home</a></td>
<td><a href="Employee_Profile.jsp">Profile</a></td>
</table>
</tr>

<table border="6"> <tr style="background-color:wheat">
<td><a href = "index.html">Logout</a></td>
&nbsp;&nbsp;
</tr></table>
<br><br><br>

<%@page import="java.sql.*"%>
<table align="center" width="1000" height="150" border="3px">

<tr>
<td>Leave ID</td>
<td>Employee ID</td>
<td>Username</td>
<td>Email</td>
<td>Phone</td>
<td>Department</td>
<td>Reason For Leave</td>
<td>Start Date</td>
<td>End Date</td>
<td>Number of Leave Days</td>
<td>Status</td>
</tr>

<%
Class.forName("com.mysql.cj.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/university";
String username = "root";
String password = "root";

Connection con = DriverManager.getConnection(url,username,password);
Object ob = session.getAttribute("id");
int id = (Integer)ob;


PreparedStatement ps = con.prepareStatement("select * from leaveA where eid=?");
ps.setInt(1 , id);
ResultSet rs = ps.executeQuery(); 

 while(rs.next())
 {
	
%>
<tr>
<td><%=rs.getInt("lid") %></td>
<td><%=rs.getInt("eid") %>
<td><%=rs.getString("username")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getLong("phone")%></td>
<td><%=rs.getString("department")%></td>
<td><%=rs.getString("reason_for_leave") %>
<td><%=rs.getString("start_date")%></td>
<td><%=rs.getString("end_date")%></td>
<td><%=rs.getString("number_of_leave_days")%></td>
<td><%=rs.getString("action")%></td>

</tr>

<%
 }
%>

</table>

</body>
