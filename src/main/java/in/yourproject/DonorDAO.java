package in.yourproject.bloodtypedetail.dao;
import java.util.ArrayList;
import com.hemalatha.exception.DBException;


import in.yourproject.model.donordetails.DonorDetails;

public interface DonorDAO {
	ArrayList<DonorDetails> findAll() throws DBException;
	boolean save(DonorDetails donor) throws DBException;
	


}
