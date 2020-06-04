<%@page import="com.mvcbeanjava.LoginMvcBean"%>
<html>
<body bgcolor="coral">
<center>
<h3>
You successfully Logged in as
<br>
<%
Object o = session.getAttribute("bean");
LoginMvcBean lb = (LoginMvcBean)o;

%>

<%=lb.getUsername() %>

</h3>


</center>

</body>

</html>
