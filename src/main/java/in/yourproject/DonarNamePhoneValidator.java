package in.yourproject.model.donordetails;

import in.yourproject.model.donordetails.DonorDetails;
import com.hemalatha.exception.ValidationException;

public class DonarNamePhoneValidator {
	
	public static void validate(DonorDetails donordetail) throws ValidationException {

		String phoneNo=donordetail.donorPhoneNo.toString();
		if (donordetail.donorName == null || donordetail.donorName.trim().equals("")) {
			throw new ValidationException("Invalid name"); // Problem Rise - shout
		} 
		else if (donordetail.bloodType == null || donordetail.bloodType.trim().equals("")) {
			throw new ValidationException("Invalid bloodtype");
		}
		
		else if (donordetail.donorPhoneNo == null || phoneNo.length()<10) {
			throw new ValidationException("Invalid phoneno");
		}
		System.out.println("Validation Success");
		
	}
}


