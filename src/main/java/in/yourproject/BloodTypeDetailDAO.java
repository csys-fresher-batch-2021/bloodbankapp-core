package in.yourproject;

	import java.util.ArrayList;
	import in.yourproject.DBException;

	import in.yourproject.model.bloodtype.BloodTypeDetail;

	public interface BloodTypeDetailDAO {

		ArrayList<BloodTypeDetail> findAll() throws DBException;
		
	}
