package in.yourproject.bloodtypedetail.dao;
	
	import java.util.ArrayList;

	import in.yourproject.model.bloodtype.BloodTypeDetail;

	public class BloodTypeDetailDAO {

		//save( passing too many things as arguments ) - BAD Practice
		public static void save(String bloodId, String bloodType) {
			
		}
		
		// save( BAG bag)  
		public static void save(BloodTypeDetail bloodTypeDetail) {
			System.out.println(bloodTypeDetail);
			String sql = "insert into bloodTypeDetail (bloodId,bloodType) values (" + bloodTypeDetail.bloodId + ",'" + bloodTypeDetail.bloodType +"')";
			
			//Check whether query is formed correctly with the data
			System.out.println(sql);
			
		}
		
		public static ArrayList<BloodTypeDetail> findAll() {
			String sql ="select bloodType from bloodtypedetail";
			System.out.println(sql);
			
			//Empty Bag
			ArrayList<BloodTypeDetail> bloodTypes = new ArrayList<BloodTypeDetail>();
			
		//Temporary =>  JDBC ==> Start ( 5 lines of code => we will fetch data from oracle tables )
			BloodTypeDetail bloodtype1 = new BloodTypeDetail("BL01","O+");
			BloodTypeDetail bloodtype2 = new BloodTypeDetail("BL02","O-");
			

			bloodTypes.add(bloodtype1); // Add items to bag
			bloodTypes.add(bloodtype2);// Add items to bag
			
			//Temporary =>  JDBC ==> End				
			return bloodTypes; //return type
			
			
		}
		
		public static BloodTypeDetail findOne(String bloodId) {
			String sql ="select bloodId,bloodType from BloodTypeDetail where bloodId =" + bloodId;
			System.out.println(sql);	
			
			//Temporary =>  JDBC ==> Start ( 5 lines of code => we will fetch data from oracle tables )
			BloodTypeDetail bloodtype1 = new BloodTypeDetail("BL01","O+");		
			//Temporary =>  JDBC ==> End				
			
			return bloodtype1;
			
			
		}
				

	}



