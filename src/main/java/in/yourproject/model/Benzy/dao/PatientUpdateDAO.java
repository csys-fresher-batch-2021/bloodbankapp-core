package in.yourproject.model;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class PatientUpdateDAO {
	
		
			//If any Changes in this Code inform to me
					/*code developed by Benzy L 14-07-2021
					 * @param patientdetails 
					 * @return*/
			public static void main(String[] args) throws SQLException, ClassNotFoundException {
				// TODO Auto-generated method stub

				String driverClassName = "oracle.jdbc.driver.OracleDriver";
				String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";
				String username = "apps";
				String password = "apps";

				// Step 1: Load the driver
				Class.forName(driverClassName);

				// Step 2: Connection

				Connection connection = DriverManager.getConnection(url, username, password);
				// connection.setAutoCommit(false);//default true

				System.out.println(connection);

				// String name = ;
				String patientId = "POO6";
				String patientName = "Aniq";
				String bloodType = "O-";
				String patientAddress="No 2:subash chandra bose street villupuram";
				String patientEmail="aniq7@yahoo.com";
				Long patientPhoneno=9894528445l;
				
					String sql = "Update patient  set PATIENT_NAME = ? where BLOOD_TYPE = ?";
					System.out.println(sql);

					PreparedStatement pst = connection.prepareStatement(sql);
					pst.setString(1, patientName);
					pst.setString(2, bloodType);
					
					
					
					int rows = pst.executeUpdate();
					pst.close();

					connection.close();

					System.out.println("No of rows Updated :" + rows);
			
				}
				// String sql = "insert into Patient(name) values ('" + name + "')";
				
				// String sql = "delete from patient  where name = ?";
				
				
				

				// connection.commit();

				// connection.rollback();

				

			



}
