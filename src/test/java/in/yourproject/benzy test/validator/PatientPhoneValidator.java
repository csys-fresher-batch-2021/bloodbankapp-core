package in.yourproject;
import in.yourproject.model.Patient;
import in.yourproject.ValidationException;


public class PatientPhoneValidator {

	public static void validate1(Patient patient) throws ValidationException {
		String phone=patient.patientPhoneNo.toString();

		if (patient.patientName == null || patient.patientName.trim().equals("")) {
			throw new ValidationException("Invalid name"); // Problem Rise - shout
		} 
		else if (patient.bloodType == null || patient.bloodType.trim().equals("")) {
			throw new ValidationException("Invalid bloodtype");
		}
		
		else if (patient.patientPhoneNo == null || phone.length()<10) {
			throw new ValidationException("Invalid phoneno");
		}
		System.out.println("Validation Success");
		
	}
}

