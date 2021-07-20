package in.yourproject;
import in.yourproject.BloodDonationInformation;
import in.yourproject.BloodDonationImp;
import in.yourproject.BloodDonationDao;
public class BloodDonationDaoTest {

	public static void main(String[] args) {

		
		BloodDonationDao bloodDao = new BloodDonationImp();
		
		BloodDonationInformation bloodDon = new BloodDonationInformation("BL01","DOO5","E002",5);
		
		try {
			bloodDao.updateBloodDonation(bloodDon);
			System.out.println("Successfully updated Blood Donation Information");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Failure:" + errorMessage);
			e.printStackTrace();
		}
	}
	}
		
