	
package com.hemalatha.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.bloodtype.exception.DBException;

	public class ConnectionUtilTest {

		public static Connection getConnection() throws DBException {
			String driverClassName = "oracle.jdbc.driver.OracleDriver";		
			String url = "jdbc:oracle:thin:@192.168.0.20:1521:DBEBS12";			
			String username = "apps";		
			String password = "apps";
			
			Connection connection = null;
			try {
				//Step 1: Load the driver
				Class.forName(driverClassName);
				
				//Step 2: Connection			
				connection = DriverManager.getConnection(url, username,password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				throw new DBException(e,"Unable to load the db driver class");
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DBException(e,"Unable to connect database");
			}
			
			System.out.println(connection);		

			return connection;
		}
		
		
		public static void close(PreparedStatement pst, Connection connection) {
			try {
				if(pst !=null) {
					pst.close();
				}
				if(connection !=null) {
					connection.close();
				}
			} catch (SQLException e) {
				//suppress exception
			}
		}
		
		public static void close(PreparedStatement pst, ResultSet rs, Connection connection) {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pst !=null) {
					pst.close();
				}
				if(connection !=null) {
					connection.close();
				}
			} catch (SQLException e) {
				//suppress exception
			}
		}
	

}
