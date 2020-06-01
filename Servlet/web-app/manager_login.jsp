<%@page import="java.sql.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/university";
String username = "root";
String password = "root";
Connection con=DriverManager.getConnection(url,username,password);

String user=request.getParameter("user");
String pass=request.getParameter("pass");
/*
Object ob=session.getAttribute("eid");
 int id=(Integer)ob;
 */


PreparedStatement ps=con.prepareStatement("select * from manager where username=? and password=?");
ps.setString(1,user);
ps.setString(2,pass);

ResultSet rs=ps.executeQuery();

if(rs.next()){
	HttpSession hs = request.getSession();
	hs.setAttribute("department",rs.getString("department"));
	hs.setAttribute("id", rs.getInt("mid"));
	response.sendRedirect("./manager_home.jsp?msg=Login_Success");
	


//int x=ps.executeUpdate();
//if(x!=0) {
	//response.sendRedirect("./employee_loginform.jsp?msg=login_failed");
}
else 
	response.sendRedirect("./ManagerLoginform.jsp?msg=login Failed");
	


%>