package in.yourproject;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BranchInformationDao {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";
		String username = "apps";
		String password = "apps";
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection);

		String branchNo = "B007";
		String street = "Anna Nagar";
		String city = "Chennai";
		long postcode = 600006l;
		String sql = "Insert into branch(Branch_no,Street,City,Postcode) values(?,?,?,?)";
		System.out.println(sql);
		
	PreparedStatement pst = connection.prepareStatement(sql);
	pst.setString(1, branchNo);
	pst.setString(2, street);
	pst.setString(3, city);
	pst.setLong(4,postcode);
	int rows = pst.executeUpdate();
	pst.close();
	
	connection.close();
	
	System.out.println("No of rows inserted :" + rows);
	}

}
