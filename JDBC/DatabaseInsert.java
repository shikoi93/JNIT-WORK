
package JDBC;
import java.sql.*;

//Importing the connection package.
import Connection.*;


public class DatabaseInsert {
	public static void main (String args[]) throws Exception
	
	{
		MySQL exec = new MySQL();
		Connection conn = exec.MySQL();
		Statement s = conn.createStatement();
		
		ResultSet rs = s.executeQuery("select a.id,a.name,a.salary,b.deptid,b.name,c.name from jnit a inner join jnit_dept b on a.id=b.id inner join jnitm c on b.deptid=c.deptid;");
		System.out.println("ID\tEmpName\tSalary\tDeptID\tDeptName\tManagerName");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getInt(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
			
		}
	}
	
	
}