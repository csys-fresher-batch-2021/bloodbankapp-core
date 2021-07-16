package in.yourproject;

import in.yourproject.BranchInformation;
import in.yourproject.ValidStringBranch;

public class ValidationBranchTest {
	public static void testCase1() {
		BranchInformation branchInfo = new BranchInformation("B002","Pallavan street","Kanchipuram","631501");

		try {
			ValidStringBranch.validate(branchInfo);
			System.out.println("Success");
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void testCase2() {
		BranchInformation branchInfo = new BranchInformation("B002","Pallavan street","Kanchipuram","631501");

		try {
			ValidStringBranch.validate(branchInfo);
			System.out.println("Success");
			System.out.println("Send details to db");
		} catch (Exception e) {

			System.out.println("Error:" + e.getMessage());
			e.printStackTrace();
		}

	}

	public static void testCase3() {
		BranchInformation branchInfo = new BranchInformation("B002","Pallavan street","Kanchipuram","631501");// no error = outside try block

		try {
			ValidStringBranch.validate(branchInfo); // exception - try/catch
			System.out.println("Success");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		//testCase1();
		testCase2();
		//testCase3();
}
}
