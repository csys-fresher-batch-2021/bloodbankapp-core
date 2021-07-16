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



	public static void main(String[] args) {

		//input
		String bloodType = "O+";
		String bloodId = "";

		
		try {
			
			// Start - Validation
			if (bloodType == null || bloodType.trim().equals("")) {
				throw new Exception("Invalid bloodtype"); // Jump to catch block
			}
			else if(bloodId == null || bloodId.trim().equals("")) {
				throw new Exception("Invalid bloodid.");
			}

			// End Validation
			
			// StudentDAO.save(name); 

			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Catch");
			String errorMessage = e.getMessage();
			System.out.println("errorMessage:" + errorMessage);
			e.printStackTrace();
		}
	}


}

