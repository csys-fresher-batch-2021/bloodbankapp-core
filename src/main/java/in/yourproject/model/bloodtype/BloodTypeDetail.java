
package in.yourproject.model.bloodtype;

public class BloodTypeDetail {
	
		public String bloodId;
		public String bloodType;
		public BloodTypeDetail() {
			System.out.println("Constructor");
     
	}
		
		public BloodTypeDetail(String bloodId, String bloodType) {
			super();
			this.bloodId = bloodId;
			this.bloodType = bloodType;
		}
		@Override
		public String toString() {
			return "BloodTypeDetails [bloodId=" + bloodId + ", bloodType=" + bloodType + "]";
			
		}
		

	}


