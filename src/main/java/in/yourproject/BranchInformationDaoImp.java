package in.yourproject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import in.yourproject.ConnectionUtilTest;
import in.yourproject.BranchInformation;
import in.yourproject.BranchInformationDao;
public class BranchInformationDaoImp  implements BranchInformationDao {
	
	@Override
	public boolean save(BranchInformation branchinformation) throws Exception {
		// TODO Auto-generated method stub
		String postalCode=branchinformation.postcode.toString();
		if (postalCode.length()==6) {
		String sql =  "Insert into branch(Branch_no,Street,City,Postcode) values('"+branchinformation.branchNo+"',"
				+ "'"+branchinformation.street+"','"+branchinformation.city+"',"+branchinformation.postcode+")";
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
					throw new Exception( "Unable to add Branch Information");
				}
				finally {
					/*if(pst !=null) {
						pst.close();
					}
					if(connection !=null) {
						connection.close();
					}*/
					ConnectionUtilTest.close(pst, connection);
					
				}}
		else {
			System.out.println("postal code not valid");
	}
		return false;
	}

}