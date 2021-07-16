package in.yourproject;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class BloodDonationDao {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub

		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";
		String username = "apps";
		String password = "apps";
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection);
		
		String bloodId ="BL03";
		int bloodQuantity =3;
		
		String sql = "Update blood set blood_Quantity = ? where blood_id = ?";
		System.out.println(sql);
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setInt(1, bloodQuantity);
		pst.setString(2, bloodId);
		int rows = pst.executeUpdate();
		pst.close();
		connection.close();

		System.out.println("No of rows Updated :" + rows);
	}

}
