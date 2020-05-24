import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseUpdate {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jnit?serverTimezone=UTC";
		String username="root";
		String password="mysql2020";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established.");
		Statement s = con.createStatement();
		int a = s.executeUpdate("update employee set id=2335 where salary=72000");
		if(a!=0);
		System.out.println("Record Updated.");
		
		
		
	}

}
