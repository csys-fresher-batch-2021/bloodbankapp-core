package in.yourproject.bloodtypedetail.dao;
	
import java.util.List;

import in.yourproject.model.bloodtype.BloodTypeDetail;

	public interface BloodTypeDetailDAO {
	
			List<BloodTypeDetail> findAll() throws Exception;
			
			List<BloodTypeDetail> findOne(String bloodType) throws Exception;
		}

		
		

		


		
		

		



		
		

		

