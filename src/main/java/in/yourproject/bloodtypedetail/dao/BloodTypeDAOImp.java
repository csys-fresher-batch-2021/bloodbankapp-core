package in.yourproject.bloodtypedetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import in.yourproject.model.bloodtype.BloodTypeDetail;
import com.hemalatha.util.ConnectionUtil;

public class BloodTypeDAOImp implements BloodTypeDetailDAO {

	public List<BloodTypeDetail> findAll() throws Exception {

		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		// 4. Iterate results and get row and column values
		ArrayList<BloodTypeDetail> bloodTypeList = null;
		try {
			// 1. Get DB connection
			connection = ConnectionUtil.getConnection();

			String sql = "select blood_id,blood_type from bloodtype ";

			// 2. Prepare Query
			pst = connection.prepareStatement(sql);

			// 3. Execute Query and get results
			rs = pst.executeQuery();

			bloodTypeList = new ArrayList<>();
			while (rs.next()) {
				// Get Column values
				String bloodid = rs.getString("blood_id");
				String bloodtype = rs.getString("blood_type");

				BloodTypeDetail all = new BloodTypeDetail(bloodid, bloodtype);

				bloodTypeList.add(all);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to show bloodtypedetail");
		} finally {
			ConnectionUtil.close(pst, rs, connection);
		}

		return bloodTypeList;
	}

	public List<BloodTypeDetail> findOne(String bloodtype) throws Exception {

		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		// 4. Iterate results and get row and column values
		List<BloodTypeDetail> bloodTypeDetail = null;
		try {
			// 1. Get DB connection
			connection = ConnectionUtil.getConnection();

			String sql = "select blood_id,blood_type from bloodtype where blood_type = ?";

			// 2. Prepare Query
			pst = connection.prepareStatement(sql);
			pst.setString(1, bloodtype);

			// 3. Execute Query and get results
			rs = pst.executeQuery();
			bloodTypeDetail = new ArrayList<>();
			if (rs.next()) {
				// Get Column values
				String bloodid = rs.getString("blood_id");
				String bloodType = rs.getString("blood_type");

				BloodTypeDetail one = new BloodTypeDetail(bloodid, bloodType);

				bloodTypeDetail.add(one);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Unable to find bloodtype details");
		} finally {
			ConnectionUtil.close(pst, rs, connection);
		}

		return bloodTypeDetail;

	}
}
