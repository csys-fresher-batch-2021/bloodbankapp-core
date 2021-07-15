package in.yourproject.bloodtypedetail.dao;

	import java.util.ArrayList;
	import com.hemalatha.exception.DBException;

	import in.yourproject.model.bloodtype.BloodTypeDetail;

	public interface BloodTypeDetailDAO {

		ArrayList<BloodTypeDetail> findAll() throws DBException;
		
	}
