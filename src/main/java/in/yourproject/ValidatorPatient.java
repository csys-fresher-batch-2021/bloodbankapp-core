package in.yourproject;

public class ValidatorPatient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input
				String patientId = null;
				String patientName = "";
				String bloodType= "";
				Long phoneNo=9897653101l;
			    String phoneNumber= phoneNo.toString();
				

				try {
					
					// Start - Validation
					if (patientId == null || patientId.trim().equals("")) {
						throw new Exception("Invalid patient id"); // Jump to catch block
					}
					else if(patientName == null || patientName.trim().equals("")) {
						throw new Exception("enter valid patient name");
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


