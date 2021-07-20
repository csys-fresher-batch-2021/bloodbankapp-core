package in.yourproject.model.bloodtype;
import in.yourproject.bloodtypedetail.dao.BloodTypeDetailDAO;

import java.util.List;

import in.yourproject.bloodtypedetail.dao.BloodTypeDAOImp;

public class SearchBloodTypeTest {
	public static void main(String[] args) {

		BloodTypeDetailDAO bloodTypeDAO = new BloodTypeDAOImp();
		try {
			List<BloodTypeDetail> bloodType = bloodTypeDAO.findOne("A+");
			System.out.println(bloodType);
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Failure:" + errorMessage);
			e.printStackTrace();
		}
	}

}
