package in.yourproject.model;

public class ValidationBranchdetails {
	public static void main(String[] args) {

		//input
		String eventId = null;
		String branchNo = "";
		

		try {
			
			// Start - Validation
			if (eventId == null || eventId.trim().equals("")) {
				throw new Exception("Invalid event id"); // Jump to catch block
			}
			else if(branchNo == null || branchNo.trim().equals("")) {
				throw new Exception("enter valid branch no");
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
