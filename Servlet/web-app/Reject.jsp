<%@page import="java.sql.*,java.text.*,java.util.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/university";
String username = "root";
String password = "root";

Connection con=DriverManager.getConnection(url,username,password);
String id=request.getParameter("id");

int mid=Integer.parseInt(id);
PreparedStatement ps=con.prepareStatement("update leaveA set action='Reject' where lid=?");
ps.setInt(1,mid);

int x=ps.executeUpdate();

if(x!=0)
	response.sendRedirect("./Leave_Application.jsp?msg=Rejected");
%>

	