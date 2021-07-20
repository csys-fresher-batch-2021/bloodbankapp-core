package in.yourproject.model.bloodtype;
import in.yourproject.bloodtypedetail.dao.BloodTypeDetailDAO;
import in.yourproject.bloodtypedetail.dao.BloodTypeDAOImp;
import in.yourproject.model.bloodtype.BloodTypeDetail;
import java.util.ArrayList;

public class FindAllBloodTypeTest {
	public static void main(String[] args) {

		BloodTypeDetailDAO bloodTypeDAO = new BloodTypeDAOImp();
		try {
			ArrayList<BloodTypeDetail> bloodTypeList = bloodTypeDAO.findAll();
			for (BloodTypeDetail bloodType : bloodTypeList) {
				System.out.println();
			}
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Failure:" + errorMessage);
			e.printStackTrace();
		}
	}

}
