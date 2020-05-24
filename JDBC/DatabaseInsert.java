import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DatabaseInsert {

		// TODO Auto-generated method stub
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
			int a = s.executeUpdate("insert into employee values(2334,'Shiva', 70000)");
			int b = s.executeUpdate("insert into employee values(2335,'Keshab', 71000)");
			if(a!=0) {
				System.out.println("Record Inserted.");
				
			}
		}	
		}


