package in.yourproject.model;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class BranchDetailDao {
	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		String driverClassName = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";
		String username = "apps";
		String password = "apps";
		Class.forName(driverClassName);
		Connection connection = DriverManager.getConnection(url, username, password);
		System.out.println(connection);
		
		
		String branchNo = "B008";
		String eventId = "E007";
		LocalDate eventDate = LocalDate.parse("2019-05-29");
		String sql = "Insert into blooddonevent(event_id ,branch_no,event_date) values(?,?,?)";
		System.out.println(sql);
		
		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, branchNo);
		pst.setString(2, eventId);
		pst.setDate(3, Date.valueOf(eventDate));
		int rows = pst.executeUpdate();
		pst.close();
		
		connection.close();
	
		System.out.println("No of rows inserted :" + rows);
		}

	

}

