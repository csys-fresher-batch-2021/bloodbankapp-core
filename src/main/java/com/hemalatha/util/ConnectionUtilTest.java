	
package com.hemalatha.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bloodtype.exception.DBException;

	public class ConnectionUtilTest {

		public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
			
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
			
			String stud_name = "Latha";
			//String sql = "insert into test_students(name) values ('" + name + "')";
			//String sql = "insert into test_student_v1(student_id,stud_name) values (XX_test.nextval,?)";
			String sql = "delete from test_student_v1 where stud_name = ?";
			System.out.println(sql);
			
			
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, stud_name);
			int rows = pst.executeUpdate();
			
			//connection.commit();
			
			//connection.rollback();
			
			pst.close();
			
			connection.close();
			
			
			System.out.println("No of rows inserted :" + rows);
			

		}

	}



