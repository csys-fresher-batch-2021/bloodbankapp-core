package in.yourproject.model;

public class BloodTypeDetails {
	
		public int bloodId;
		public String bloodType;
		public BloodTypeDetails() {
			System.out.println("Constructor");
     
	}
		public BloodTypeDetails(int bloodId,String bloodType) {
		this.bloodId=bloodId;
		this.bloodType=bloodType;
		}
		@Override
		public String toString() {
			return "BloodTypeDetails [bloodId=" + bloodId + ", bloodType=" + bloodType + "]";
			
		}
		

	}




