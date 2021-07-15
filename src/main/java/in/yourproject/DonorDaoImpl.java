package in.yourproject.bloodtypedetail.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.LocalDate;
import in.yourproject.model.donordetails.DonorDetails;
import com.hemalatha.exception.DBException;
import in.yourproject.bloodtypedetail.dao.DonorDAO;
import com.hemalatha.test.ConnectionUtilTest;


public class DonorDaoImpl implements DonorDAO {
	
	public boolean runDMLQuery(String sql) throws DBException {
		System.out.println(sql);

		Connection connection = null;
		PreparedStatement pst = null;
		try {
			connection = ConnectionUtilTest.getConnection();
			pst = connection.prepareStatement(sql);
			int rows = pst.executeUpdate();
			
			System.out.println("No of rows inserted :" + rows);
			return rows == 1;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e, "Unable to add products");
		}
		finally {
			
			ConnectionUtilTest.close(pst, connection);
			
		}

	}


		public ArrayList<DonorDetails> findAll() throws DBException {

			Connection connection = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			
			// 4. Iterate results and get row and column values
			ArrayList<DonorDetails> donorList;
			try {
				// 1. Get DB connection
				connection = ConnectionUtilTest.getConnection();

				String sql = "select donor_id,donor_name,blood_type,donor_address,donor_email,donor_phone_no,active,last_donated_on  from donor_hem";

				// 2. Prepare Query
				pst = connection.prepareStatement(sql);

				// 3. Execute Query and get results
				rs = pst.executeQuery();

				donorList = new ArrayList<DonorDetails>();
				while (rs.next()) {
					// Get Column values
					String donorid = rs.getString("donor_id");
					String donorname = rs.getString("donor_name");
					String bloodtype = rs.getString("blood_type");
					String donoraddress = rs.getString("donor_address");
					String donoremail = rs.getString("donor_email");
					Long donorphoneno = rs.getLong("donor_phone_no");
					int active = rs.getInt("active");
					LocalDate leaveDate = LocalDate.parse("2021-02-07");
					
					DonorDetails donor = new DonorDetails();
					donor.setDonorId(donorid);
					donor.setDonorName(donorname);
					donor.setBloodType(bloodtype);
					donor.setDonorAddress(donoraddress);
					donor.setDonorMail(donoremail);
					donor.setDonorPhoneNo(donorphoneno);
					donor.setActive(active);
					donor.setLastDonatedOn(leaveDate);

					
					System.out.println(donor);

					donorList.add(donor);

				}
			}catch (SQLException e) {
				e.printStackTrace();
				throw new DBException(e, "Unable to fetch donor details");
			}
			finally {
				ConnectionUtilTest.close(pst, rs, connection);
			}

			return donorList;

		}
		
		public boolean save(DonorDetails donor) throws DBException {

			String sql = "insert into donor_hem values('" + donor.getDonorId() + "','" + donor.getDonorName() + "','"+donor.getBloodType()+"','"+donor.getDonorAddress()+"','"+donor.getDonorMail()+"','"+donor.getDonorPhoneNo()+"','"+donor.getActive()+"','"+donor.getLastDonatedOn()+ ")";
			System.out.println(sql);

			Connection connection = null;
			PreparedStatement pst = null;
			try {
				connection = ConnectionUtilTest.getConnection();
				pst = connection.prepareStatement(sql);
				int rows = pst.executeUpdate();
				System.out.println("No of rows inserted :" + rows);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new DBException(e, "Unable to add products");
			}
			finally {
				/*if(pst !=null) {
					pst.close();
				}
				if(connection !=null) {
					connection.close();
				}*/
				ConnectionUtilTest.close(pst, connection);
				
			}

			return false;
		}

		
		
		}

