package in.yourproject.bloodtypedetail.dao;

import in.yourproject.model.bloodtype.BloodTypeDetail;
import in.yourproject.bloodtypedetail.dao.BloodTypeDetailDAO;
import java.util.ArrayList;


public class BloodDetailDAOTest {

	public static void main(String[] args) {

		testSave();
		
		testFindAll();
		
		testFindOne();
		
		
		
	}

	
	public static void testFindOne() {
		 BloodTypeDetail bloodtype1 = BloodTypeDetailDAO.findOne("'BL01'");
		System.out.println(bloodtype1);
	}

	
	public static void testFindAll() {
		ArrayList<BloodTypeDetail> bloodtypes = BloodTypeDetailDAO.findAll();
		for (BloodTypeDetail bloodtype1 : bloodtypes) {
			System.out.println(bloodtype1);
		}
	}


	public static void testSave() {
		//Approach #1 ( Without Model class)
		BloodTypeDetailDAO.save("BL01","O+");
		
		//Approach #2: Using Model Class
		BloodTypeDetail bloodtype2 = new BloodTypeDetail("BL02","O-");
		
		
	}


	

}
