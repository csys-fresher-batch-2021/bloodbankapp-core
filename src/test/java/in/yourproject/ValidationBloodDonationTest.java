package in.yourproject;
import in.yourproject.BloodDonationInformation;
import in.yourproject.ValidString;
public class ValidationBloodDonationTest {

		// TODO Auto-generated method stub
		public static void testCase1() {
			BloodDonationInformation bloodInfo = new BloodDonationInformation("BL01","DOO5","E002","1");

			try {
				ValidString.validate(bloodInfo);
				System.out.println("Success");
			} catch (Exception e) {

				System.out.println("Error:" + e.getMessage());
				e.printStackTrace();
			}

		}

		public static void testCase2() {
			BloodDonationInformation bloodInfo = new BloodDonationInformation("BLO3","DOO2","E001","2");

			try {
				ValidString.validate(bloodInfo);
				System.out.println("Success");
				System.out.println("Send details to db");
			} catch (Exception e) {

				System.out.println("Error:" + e.getMessage());
				e.printStackTrace();
			}

		}

		public static void testCase3() {
			BloodDonationInformation bloodInfo = new BloodDonationInformation("BL03","DOO3","E006","1");// no error = outside try block

			try {
				ValidString.validate(bloodInfo); // exception - try/catch
				System.out.println("Success");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void main(String[] args) {
			//testCase1();
			testCase2();
			//testCase3();
		}

	

	}


