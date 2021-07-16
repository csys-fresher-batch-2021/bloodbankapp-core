package in.yourproject;

public class BloodDonationDaoTest {

	public static void  Update (String bloodId,String bloodQuantity) {
		String sql = "UPDATE Blood SET Blood_quantity = '" + bloodQuantity + "' WHERE Blood_id = '" + bloodId + "';";
		System.out.println(sql);
		
		System.out.println("Updated this Blood Quantity " + bloodId );
	}
		
		}

