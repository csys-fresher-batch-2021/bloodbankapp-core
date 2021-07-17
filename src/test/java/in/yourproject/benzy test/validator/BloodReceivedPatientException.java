package in.yourproject.model;

import in.yourproject.model.BloodReceivedPatientInformation;
import in.yourproject.model.ValidationException;

public  class BloodReceivedPatientException {

	

		
		public static void validate(BloodReceivedPatientInformation bloodReceivedPatient) throws ValidationException {


			if (bloodReceivedPatient.patientId == null || bloodReceivedPatient.patientId.trim().equals("")) {
				throw new ValidationException("Invalid name"); // Problem Rise - shout
			} 
			else if (bloodReceivedPatient.bloodId == null || bloodReceivedPatient.bloodId.trim().equals("")) {
				throw new ValidationException("Invalid bloodtype");
			}
			
		
			System.out.println("Validation Success");
			
		}
	}


	
	
	

