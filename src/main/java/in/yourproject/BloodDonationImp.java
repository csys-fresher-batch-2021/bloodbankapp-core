package in.yourproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.yourproject.ConnectionUtilTest;

import in.yourproject.BloodDonationDao;

public class BloodDonationImp implements  BloodDonationDao{
	public boolean updateBloodDonation(BloodDonationInformation bloodinfom) throws Exception {

		String sql = "Update blood set blood_Quantity = ? where blood_id = ?";
		System.out.println(sql);

		Connection connection = null;
		PreparedStatement pst = null;
		
		try {
			connection = ConnectionUtilTest.getConnection();
			pst = connection.prepareStatement(sql);
			pst.setInt(1, bloodinfom.getBloodQuantity());
			pst.setString(2, bloodinfom.getBloodId());

			int rows = pst.executeUpdate();
			System.out.println("No of rows update :" + rows);

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e, "Unable to update Blood Donation Information");
		}
		finally {
			ConnectionUtilTest.close(pst, connection);
		}
		return false;
	}
	
}
