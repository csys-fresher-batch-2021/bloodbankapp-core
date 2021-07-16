package in.yourproject;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

public class DonorDetDAO {


	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
				String driverClassName = "oracle.jdbc.driver.OracleDriver";		
				String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";		
				String username = "apps";		
				String password = "apps";
				
				//Step 1: Load the driver
				Class.forName(driverClassName);
				
				//Step 2: Connection
				
				Connection connection = DriverManager.getConnection(url, username,password);
				//connection.setAutoCommit(false);//default true 
				
				System.out.println(connection);
				
				//String name = ;
				String donor_Id="DOO8";
				String donor_Name="Hema";
				String blood_Type="O+";
				String donor_Address="pallavan nagar,Kanchipuram";
				String donor_email="hemsdg@gmail.com";
				Long donor_Phone_No=9894528554l;
				int active=1;
				LocalDate last_donated_on = LocalDate.parse("2021-06-09");
				
			
				
				//String sql = "insert into donor_hem values ('" + donor_Name + "')";
				String sql = "insert into donor_hem values (?,?,?,?,?,?,?,?)";
				
				System.out.println(sql);
				
				
				PreparedStatement pst = connection.prepareStatement(sql);
				pst.setString(1, donor_Id);
				pst.setString(2, donor_Name);
				pst.setString(3, blood_Type);
				pst.setString(4, donor_Address);
				pst.setString(5, donor_email);
				pst.setLong(6, donor_Phone_No);
				pst.setInt(7, active);
				pst.setDate(8, Date.valueOf(last_donated_on));
				
				int rows = pst.executeUpdate();
				
				//connection.commit();
				
				//connection.rollback();
				
				pst.close();
				
				connection.close();
				
				
				System.out.println("No of rows inserted :" + rows);
				

			}

		

		

}
