package in.yourproject;

import in.yourproject.model.Patient;
import in.yourproject.model.ValidationException;



public class BloodPhoneValidator {

		

			
			public static void validate(Patient patient) throws ValidationException {


				if (patient.patientId == null || patient.patientId.trim().equals("")) {
					throw new ValidationException("Invalid name"); // Problem Rise - shout
				} 
				else if (patient.patientName == null || patient.patientName.trim().equals("")) {
					throw new ValidationException("Invalid bloodtype");
				}
				
			
				System.out.println("Validation Success");
				
			}
		}
