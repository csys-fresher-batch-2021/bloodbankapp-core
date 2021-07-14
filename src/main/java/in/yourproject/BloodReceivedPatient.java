package in.yourproject;

public class BloodReceivedPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input
		String patientId = null;
		String bloodId= "";
		String quantity= "";
	
		

		try {
			
			// Start - Validation
			if (patientId == null || patientId.trim().equals("")) {
				throw new Exception("Invalid patient id"); // Jump to catch block
			}
			else if(bloodId == null || bloodId.trim().equals("")) {
				throw new Exception("enter valid bloodId");
			}
			else if (quantity== null || quantity.length() > 1) {
				throw new Exception("Invalid Quantity");
			}
			
			// End Validation
			
			// StudentDAO.save(name); 

			System.out.println("Success");
		} catch (Exception e) {
			System.out.println("Catch");
			String errorMessage = e.getMessage();
			System.out.println("errorMessage:" + errorMessage);
			e.printStackTrace();
		}
		
	}

}
