import java.sql.Connection;
import java.sql.DriverManager;;

public class DatabaseConnection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/jnit?serverTimezone=UTC";
		String username="root";
		String password="mysql2020";
		Connection con=DriverManager.getConnection(url,username,password);
		if(con!=null)
			System.out.println("Connection Established.");
		
		
	}

}
