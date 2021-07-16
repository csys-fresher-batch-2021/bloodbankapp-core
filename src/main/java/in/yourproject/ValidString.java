package in.yourproject;
import com.raj.exception.ValidationException;

import in.yourproject.BloodDonationInformation;
public class ValidString {
	
	public static void validate(BloodDonationInformation bloodInfo) throws ValidationException {

		if (bloodInfo.bloodId == null || bloodInfo.donarId.trim().equals("")) {
			throw new ValidationException("Invalid BloodID"); // Problem Rise - shout
		} 
		else if (bloodInfo.eventId == null || bloodInfo.bloodId.trim().equals("")) {
			throw new ValidationException("Invalid EventId");
		}
		System.out.println("Validation Success");

	}

	public static void validate(BranchInformation branchInfo) {
		// TODO Auto-generated method stub
		
	}
}

