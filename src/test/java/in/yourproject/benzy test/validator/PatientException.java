package in.yourproject;

import in.yourproject.model.Patient;
import in.yourproject.PatientPhoneValidator;

public class PatientException {

		public static void testCase1() {
			Patient donor1 = new Patient("POO3", "Yusri", "O-", "No 98:Adyar chennai", "yuss04@gmail.com", 9922089333l);
			try {
				PatientPhoneValidator.validate1(donor1);
				System.out.println("Success");
			} catch (Exception e) {

				System.out.println("Error:" + e.getMessage());
				e.printStackTrace();
			}

		}
		public static void testCase2() {
			Patient donor1 = new Patient("POO3", "Yusri", "O-", "No 98:Adyar chennai", "yuss04@gmail.com", 9922089333l);

			try {
				PatientPhoneValidator.validate1(donor1);
				System.out.println("Success");
				System.out.println("Send details to db");
			} catch (Exception e) {

				System.out.println("Error:" + e.getMessage());
				e.printStackTrace();
			}

		}

		public static void testCase3() {
			Patient donor1 = new Patient("POO3", "Yusri", "O-", "No 98:Adyar chennai", "yuss04@gmail.com", 9922089333l);

			try {
				PatientPhoneValidator.validate1(donor1); // exception - try/catch
				System.out.println("Success");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		public static void main(String[] args) {
			testCase1();
			//testCase2();
			//testCase3();
		}

	}