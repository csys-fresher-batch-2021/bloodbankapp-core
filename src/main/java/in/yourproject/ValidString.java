package in.yourproject;

public class ValidString {


	public static void main(String[] args) {

		//input
		String bloodType = "O+";
		String bloodId = "";

		
		try {
			
			// Start - Validation
			if (bloodType == null || bloodType.trim().equals("")) {
				throw new Exception("Invalid bloodtype"); // Jump to catch block
			}
			else if(bloodId == null || bloodId.trim().equals("")) {
				throw new Exception("Invalid bloodid.");
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

