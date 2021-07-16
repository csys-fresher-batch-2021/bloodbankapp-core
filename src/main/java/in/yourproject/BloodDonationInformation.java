package in.yourproject;

public class BloodDonationInformation {
	public String bloodId;
	public String donarId;
	public String eventId;
	public String bloodQuantity;
	public String getBloodId() {
		return bloodId;
	}
	public void setBloodId(String bloodId) {
		this.bloodId = bloodId;
	}
	public String getDonarId() {
		return donarId;
	}
	public void setDonarId(String donarId) {
		this.donarId = donarId;
	}
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getBloodQuantity() {
		return bloodQuantity;
	}
	public void setBloodQuantity(String bloodQuantity) {
		this.bloodQuantity = bloodQuantity;
	}
	public BloodDonationInformation() {
		System.out.println("Constructor");
}
	public BloodDonationInformation(String bloodId, String donarId, String eventId, String bloodQuantity) {
		super();
		this.bloodId = bloodId;
		this.donarId = donarId;
		this.eventId = eventId;
		this.bloodQuantity = bloodQuantity;
}
	@Override
	public String toString() {
		return "BloodDonationInformation [bloodId=" + bloodId + ", donarId=" + donarId + ", eventId=" + eventId +", bloodQuantity=" + bloodQuantity +"]";
		
	}
	public int getbloodId() {
		// TODO Auto-generated method stub
		return 0;
	}
	

	}

