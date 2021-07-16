package in.yourproject;
import com.raj.exception.ValidationBranch;
import com.raj.exception.ValidationException;

import in.yourproject.BranchInformation;

public class ValidStringBranch {
	public static void validate(BranchInformation branch) throws Exception {

		if (branch.branchNo == null|| branch.city == null|| branch.branchNo.trim().equals("") ||branch.branchNo.trim().equals("")){
			throw new Exception("BranchNo or City Should Be not null");
		}
		
		else if(branch.postcode == null){
			throw new Exception("Invalid Postcode");
		}
		System.out.println("Validation Success");
	}
}
