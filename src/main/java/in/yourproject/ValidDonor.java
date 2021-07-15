package in.yourproject.model.donordetails;

public class ValidDonor {
	public static void main(String[] args) {

		//input
		String donorId = "DOO1";
		String donorName = "";
		//String bloodType= "";
		String[] bloodType = new String[8];
		bloodType[0]="O+";
		bloodType[1]="O-";
		bloodType[2]="A+";
		bloodType[3]="A-";
		bloodType[4]="B+";
		bloodType[5]="B-";
		bloodType[6]="AB+";
		
		
		Long phoneNo=9897653101l;
	    String phoneNumber= phoneNo.toString();
		

		try {
			
			// Start - Validation
			if (donorId == null || donorId.trim().equals("")) {
				throw new Exception("Invalid donor id"); // Jump to catch block
			}
			else if(donorName == null || donorName.trim().equals("")) {
				throw new Exception("enter valid donor name");
			}
			else if (phoneNo== null || phoneNumber.length() <10) {
				throw new Exception("enter valid phone number");
			}
			else if (bloodType==null || bloodType.trim().equals("")) {
				throw new Exception("enter valid bloodtype");
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
