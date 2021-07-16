package in.yourproject;

public class ValidationBranchInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String branchNo = null;
		String city= null;
		Long postcode=600081l;
		String postcodeNum = postcode.toString();
		try {
			
			
			if (branchNo == null|| city == null|| branchNo.trim().equals("") ||branchNo.trim().equals("")){
				throw new Exception("BranchNo or City Should Be not null");
			}
			
			else if(postcodeNum == null ||  postcodeNum.length() <6){
				throw new Exception("Invalid Postcode");
			}
		System.out.println("Success");
	} catch (Exception e) {
		System.out.println("Catch");
		String errorMessage = e.getMessage();
		System.out.println("errorMessage:" + errorMessage);
		e.printStackTrace();
	}
	}
}


