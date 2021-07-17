package in.yourproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;


public class BrpiInsertDAO {


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
					String patientId = "POO3"; 
					String bloodId = "BL02"; 
					String bloodDate = "event1"; 
					int quantity = 1; 
				
					LocalDate event1 = LocalDate.parse("2019-08-15"); 
				
		
					String sql = "insert into bloodpatient (patient_id,blood_id,blood_date,quantity)values (?,?,?,?)";
					System.out.println(sql);
					
					
					PreparedStatement pst = connection.prepareStatement(sql);
					pst.setString(1, patientId);
					pst.setString(2, bloodId);
					pst.setObject(3, event1);
					pst.setInt(4, quantity);
					int rows = pst.executeUpdate();
					
					//connection.commit();
					
					//connection.rollback();
					
					pst.close();
					
					connection.close();
					
					
					System.out.println("No of rows inserted :" + rows);
					

				}			

	}

	

