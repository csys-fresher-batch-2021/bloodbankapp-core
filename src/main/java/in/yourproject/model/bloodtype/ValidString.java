package in.yourproject.model.bloodtype;
import in.yourproject.model.bloodtype.BloodTypeDetail;
import com.bloodtype.exception.ValidationException;
public class ValidString {
	
	public static void validate(BloodTypeDetail bloodtypedetail) throws ValidationException {

		if (bloodtypedetail.bloodType == null || bloodtypedetail.bloodType.trim().equals("")) {
			throw new ValidationException("Invalid bloodtype"); // Problem Rise - shout
		} 
		else if (bloodtypedetail.bloodId == null || bloodtypedetail.bloodId.trim().equals("")) {
			throw new ValidationException("Invalid bloodid");
		}
		System.out.println("Validation Success");

	}
}



	