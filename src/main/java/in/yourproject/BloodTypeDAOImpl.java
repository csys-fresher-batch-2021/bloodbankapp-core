package in.yourproject.bloodtypedetail.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import in.yourproject.bloodtypedetail.dao.BloodTypeDetailDAO;
import com.hemalatha.exception.DBException;
import in.yourproject.model.bloodtype.BloodTypeDetail;
import com.hemalatha.test.ConnectionUtilTest;

public class BloodTypeDAOImpl implements BloodTypeDetailDAO {


	public ArrayList<BloodTypeDetail> findAll() throws DBException {

		Connection connection = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		// 4. Iterate results and get row and column values
		ArrayList<BloodTypeDetail> bloodList;
		try {
			// 1. Get DB connection
			connection = ConnectionUtilTest.getConnection();

			String sql = "select blood_id,blood_type from bloodtype";

			// 2. Prepare Query
			pst = connection.prepareStatement(sql);

			// 3. Execute Query and get results
			rs = pst.executeQuery();

			bloodList = new ArrayList<BloodTypeDetail>();
			while (rs.next()) {
				// Get Column values
				String bloodid = rs.getString("blood_id");
				String bloodtype = rs.getString("blood_type");
				
				
				BloodTypeDetail blood = new BloodTypeDetail();
				blood.setBloodId(bloodid);
				blood.setBloodType(bloodtype);
				

				
				System.out.println(blood);

				bloodList.add(blood);

			}
		}catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e, "Unable to fetch product details");
		}
		finally {
			ConnectionUtilTest.close(pst, rs, connection);
		}

		return bloodList;

	}
	}


