import java.sql.*;


public class MySQLExample {

	public static void main(String[] args) {

		try {

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "gretycka");
			System.out.println("Connected");
			
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from customers");
			System.out.println("Selected");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
