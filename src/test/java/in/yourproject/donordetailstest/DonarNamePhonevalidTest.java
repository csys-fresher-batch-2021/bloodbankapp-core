package com.hemalatha.test;
import java.time.LocalDate;

import in.yourproject.model.bloodtype.BloodTypeDetail;
import in.yourproject.model.donordetails.DonarNamePhoneValidator;
import in.yourproject.model.donordetails.DonorDetails;

public class DonarNamePhonevalidTest {
	public static void testCase1() {
		LocalDate lastDonated3 = LocalDate.parse("2019-03-21");
		DonorDetails donor1 = new DonorDetails("DOO5","Amira","O-","No 9:Tnagar chennai","mira124@gmail.com",96597006L,1,lastDonated3);

		try {
			DonarNamePhoneValidator.validate(donor1);
			System.out.println("Success");
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}

	}
	public static void testCase2() {
		LocalDate lastDonated3 = LocalDate.parse("2019-03-21");
		DonorDetails donor1 = new DonorDetails("DOO5","","O-","No 9:Tnagar chennai","mira124@gmail.com",9659766006L,1,lastDonated3);


		try {
			DonarNamePhoneValidator.validate(donor1);
			System.out.println("Success");
			System.out.println("Send details to db");
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void testCase3() {
		LocalDate lastDonated3 = LocalDate.parse("2019-03-21");
		DonorDetails donor1 = new DonorDetails("DOO5","Amira","O-","No 9:Tnagar chennai","mira124@gmail.com",9659766006L,1,lastDonated3);
// no error = outside try block

		try {
			DonarNamePhoneValidator.validate(donor1); // exception - try/catch
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






