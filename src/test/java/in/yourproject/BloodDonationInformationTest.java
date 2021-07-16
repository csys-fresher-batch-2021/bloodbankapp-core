package in.yourproject;
import in.yourproject.BloodDonationInformation;
public class BloodDonationInformationTest {
public static void main(String[] args) {
        
		
		BloodDonationInformation bloodDonate1= new BloodDonationInformation("BL01","DOO5","E002","1");
		System.out.println(bloodDonate1.toString());
		
		BloodDonationInformation bloodDonate2= new BloodDonationInformation("BL02","DOO2","E001","2");
		System.out.println(bloodDonate2.toString());
		
		BloodDonationInformation bloodDonate3= new BloodDonationInformation("BL03","DOO3","E006","1");
		System.out.println(bloodDonate3.toString());
		
		BloodDonationInformation bloodDonate4= new BloodDonationInformation("BL04","DOO4","E004","1");
		System.out.println(bloodDonate4.toString());
		
		BloodDonationInformation bloodDonate5= new BloodDonationInformation("BL05","DOO6","E005","1");
		System.out.println(bloodDonate5.toString());
		
		BloodDonationInformation bloodDonate6= new BloodDonationInformation("BL06","DOO1","E003","2");
		System.out.println(bloodDonate6.toString());
	
}
}