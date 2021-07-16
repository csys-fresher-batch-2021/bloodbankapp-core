package in.yourproject.model;
import java.time.LocalDate;

import  in.yourproject.model.BranchDetail;
import  in.yourproject.model.ValidString;

public class BranchValidatorTest {
	public static void testCase1() {
		LocalDate event1 = LocalDate.parse("2019-05-24");
		BranchDetail branchNo1 = new BranchDetail("E003","",event1);

		try {
			ValidString.validate(branchNo1);
			System.out.println("Success");
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void testCase2() {
		LocalDate event1 = LocalDate.parse("2019-05-24");
		BranchDetail branchNo1 = new BranchDetail("","B004",event1);

		try {
			ValidString.validate(branchNo1);
			System.out.println("Success");
			System.out.println("Send details to db");
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void testCase3() {
		LocalDate event1 = LocalDate.parse("2019-05-24");
		BranchDetail branchNo1 = new BranchDetail("E003",null,event1);// no error = outside try block

		try {
			ValidString.validate(branchNo1); // exception - try/catch
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		testCase1();
		testCase2();
		testCase3();
	}

}



