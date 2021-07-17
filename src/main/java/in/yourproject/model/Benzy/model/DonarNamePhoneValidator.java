package in.yourproject.model;
import in.yourproject.model.ValidationException; 
import in.yourproject.model.Patient;
public class DonarNamePhoneValidator {
	
	public static void validate(Patient detail) throws ValidationException {

		String phoneNo=detail.patientPhoneNo.toString();
		if (detail.patientName == null ||detail.patientName.trim().equals("")) {
			throw new ValidationException("Invalid name"); // Problem Rise - shout
		} 
		else if (detail.bloodType == null || detail.bloodType.trim().equals("")) {
			throw new ValidationException("Invalid bloodid");
		}
		
		else if (detail.patientPhoneNo == null || phoneNo.length()<10) {
			throw new ValidationException("Invalid bloodid");
		}
		System.out.println("Validation Success");
		

	}
}