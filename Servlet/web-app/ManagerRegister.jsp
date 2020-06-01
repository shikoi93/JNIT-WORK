<%@page import="java.sql.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/university";
String username = "root";
String password = "root";
Connection con=DriverManager.getConnection(url,username,password);

String user=request.getParameter("user");
String pass=request.getParameter("pass");
String email=request.getParameter("email");
String mobile=request.getParameter("phone");
Long phone=Long.parseLong(mobile);

String department=request.getParameter("department");

PreparedStatement ps=con.prepareStatement("insert into manager (username,password,email,phone,department) values(?,?,?,?,?)");



/*
Object ob=session.getAttribute("eid");
 int id=(Integer)ob;
 */
ps.setString(1,user);
ps.setString(2,pass);
ps.setString(3,email);
ps.setLong(4,phone);
ps.setString(5,department);


int x=ps.executeUpdate();
if(x!=0) 
{
	response.sendRedirect("./ManagerLoginform.jsp?msg=Login_Success");

}

%>