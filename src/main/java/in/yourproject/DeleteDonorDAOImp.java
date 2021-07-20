package in.yourproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.yourproject.DonorDetails;
import com.hemalatha.util.ConnectionUtil;
import in.yourproject.DeleteDonorDAO;


public class DeleteDonorDAOImp implements DeleteDonorDAO {
	
	@Override
	public boolean delete(int active) throws Exception {

		String sql = "delete from donor_hem where active < ?";// Good Practice
		System.out.println(sql);

		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtil.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setInt(1, active);// 1st ?

			int rows = pst.executeUpdate();
			System.out.println("No of rows deleted :" + rows);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e, "Unable to delete product ");
		}
		finally {
			
			ConnectionUtil.close(pst, connection);
			
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
