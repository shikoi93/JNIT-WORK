<%@page import="java.sql.*,java.text.*,java.util.*" %>

<%
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/university";
String username = "root";
String password = "root";
Connection con=DriverManager.getConnection(url,username,password);

String user=request.getParameter("user");
String email=request.getParameter("email");
String mobile=request.getParameter("phone");
Long phone=Long.parseLong(mobile);

String department=request.getParameter("department");
String start_date=request.getParameter("start_date");
String end_date=request.getParameter("end_date");
String reason=request.getParameter("reason_for_leave");
//String number_of_leave_days=request.getParameter("nold");

SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
long diff = (dt.parse(end_date)).getTime() - (dt.parse(start_date)).getTime();//diff in millisecons
int nolds=(int) (diff/(24*60*60*1000));
int numberofdays;
if(nolds<0)
	numberofdays=0;

else
	numberofdays=nolds;

Object ob=session.getAttribute("id");
int id=(Integer)ob;

PreparedStatement ps=con.prepareStatement("insert into leaveA (eid,username,email,phone,department,reason_for_leave,start_date,end_date,number_of_leave_days) values(?,?,?,?,?,?,?,?,?)");





 
ps.setInt(1,id);
ps.setString(2,user);
ps.setString(3,email);
ps.setLong(4,phone);
ps.setString(5,department);
ps.setString(6,reason);
ps.setString(7,start_date);
ps.setString(8,end_date);
ps.setInt(9,nolds);




int x=ps.executeUpdate();
if(x!=0) 
{
	response.sendRedirect("./Employee_Profile.jsp?msg=Login_Success");

}

%>