package com.bloodtype.validator;
import in.yourproject.model.bloodtype.BloodTypeDetail;
import in.yourproject.model.bloodtype.ValidString;

public class BloodTypeValidatorTest {
	public static void testCase1() {
		BloodTypeDetail bloodtype1 = new BloodTypeDetail("BL01",null);

		try {
			ValidString.validate(bloodtype1);
			System.out.println("Success");
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void testCase2() {
		BloodTypeDetail bloodtype1 = new BloodTypeDetail("","O-");

		try {
			ValidString.validate(bloodtype1);
			System.out.println("Success");
			System.out.println("Send details to db");
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void testCase3() {
		BloodTypeDetail bloodtype1 = new BloodTypeDetail("BL02","");// no error = outside try block

		try {
			ValidString.validate(bloodtype1); // exception - try/catch
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		//testCase1();
		//testCase2();
		//testCase3();
	}

}


