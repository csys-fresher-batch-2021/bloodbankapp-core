package in.yourproject;

public class ValidationBloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bloodId = null;
		String donorId = null;
		String eventId= null;
		String quantity="";
	try {
			
	
			if (bloodId == null|| donorId == null|| donorId.trim().equals("")){
				throw new Exception("BloodId or DonorId Should Be not null");
			}
			
			else if(eventId == null || eventId.trim().equals("")){
				throw new Exception("Enter EventId");
			}
			
			else if(quantity ==null || quantity.length() > 1 || eventId.trim().equals("")){
				throw new Exception("Invalid Blood Quantity");
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
