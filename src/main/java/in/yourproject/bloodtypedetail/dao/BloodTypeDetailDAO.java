package in.yourproject.bloodtypedetail.dao;
	
	import java.util.ArrayList;
    
	import in.yourproject.model.bloodtype.BloodTypeDetail;

	public interface BloodTypeDetailDAO {
	
			ArrayList<BloodTypeDetail> findAll() throws Exception;
			
			BloodTypeDetail findOne(String bloodType) throws Exception;
		}

		
		

		



		
		

		

