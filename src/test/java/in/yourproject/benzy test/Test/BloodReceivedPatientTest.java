package in.yourproject.model;

import java.time.LocalDate;

import in.yourproject.model.BloodReceivedPatientInformation;
import in.yourproject.model.ValidationException;



public class BloodReceivedPatientTest {

	

	
		public static void testCase1() {
			LocalDate event1 = LocalDate.parse("2019-08-15");
			BloodReceivedPatientInformation brpi1 = new BloodReceivedPatientInformation("Poo3","BL02",event1,1);

			try {
				BloodReceivedPatientException.validate(brpi1);
				System.out.println("Success");
			} catch (Exception e) {

				System.out.println("Error:" + e.getMessage());
				e.printStackTrace();
			}

		}
		public static void testCase2() {
			LocalDate event1 = LocalDate.parse("2019-08-15");
			BloodReceivedPatientInformation brpi1 = new BloodReceivedPatientInformation("POO3","BL02",event1,1);


			try {
				BloodReceivedPatientException.validate(brpi1);
				System.out.println("Success");
				System.out.println("Send details to db");
			} catch (Exception e) {

				System.out.println("Error:" + e.getMessage());
				e.printStackTrace();
			}

		}

		public static void testCase3() {
			LocalDate event1 = LocalDate.parse("2019-08-15");
			BloodReceivedPatientInformation brpi1 = new BloodReceivedPatientInformation("Poo3","BL02",event1,1);
	// no error = outside try block

			try {
				BloodReceivedPatientException.validate(brpi1); // exception - try/catch
				System.out.println("Success");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void main(String[] args) {
			//testCase1();
			//testCase2();
			testCase3();
		}

	}
	

