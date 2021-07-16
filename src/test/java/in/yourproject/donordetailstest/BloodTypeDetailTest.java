package in.yourproject.donordetailstest;

import in.yourproject.model.bloodtype.BloodTypeDetail;

public class BloodTypeDetailTest {

	public static void main(String[] args) {

		
		BloodTypeDetail bloodType1= new BloodTypeDetail("BL01","O+");
		System.out.println(bloodType1.toString());
		
		BloodTypeDetail bloodType2= new BloodTypeDetail("BL02","O-");
		System.out.println(bloodType2.toString());
		
		BloodTypeDetail bloodType3= new BloodTypeDetail("BL03","A+");
		System.out.println(bloodType3.toString());
		
		BloodTypeDetail bloodType4= new BloodTypeDetail("BL04","A-");
		System.out.println(bloodType4.toString());
		
		BloodTypeDetail bloodType5= new BloodTypeDetail("BL05","B+");
		System.out.println(bloodType5.toString());
		
		BloodTypeDetail bloodType6= new BloodTypeDetail("BL06","AB-");
		System.out.println(bloodType6.toString());
		
		BloodTypeDetail bloodType7= new BloodTypeDetail("BL07","AB+");
		System.out.println(bloodType7.toString());
		
		BloodTypeDetail bloodType8= new BloodTypeDetail("BL08","B-");
		System.out.println(bloodType8.toString());
	}

}
