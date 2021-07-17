package in.yourproject.model;
import  in.yourproject.model.BranchDetail;
import  com.arunkumar.exception.ValidationException;
public class ValidString {
	
	public static void validate(BranchDetail BranchDetail) throws ValidationException {

		if (BranchDetail.branchNo == null || BranchDetail.branchNo.trim().equals("")) {
			throw new ValidationException("Invalid branchNo"); // Problem Rise - shout
		} 
		else if (BranchDetail.eventId == null || BranchDetail.eventId.trim().equals("")) {
			throw new ValidationException("Invalid eventId");
		}
		System.out.println("Validation Success");

	}
}
