package in.yourproject;
import in.yourproject.ValidationException;  
import in.yourproject.BloodReceivedPatientInformation;



public class BloodReceivedPatientException {
	public static void validate(BloodReceivedPatientInformation detail) throws ValidationException {

		
		if (detail.patientId == null ||detail.patientId.trim().equals("")) {
			throw new ValidationException("Invalid name"); // Problem Rise - shout
		} 
		else if (detail.bloodId == null || detail.bloodId.trim().equals("")) {
			throw new ValidationException("Invalid bloodid");
		}
		
		System.out.println("Validation Success");
		
	
	
}
}