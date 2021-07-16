package in.yourproject.model.donordetails;
import java.time.LocalDate;

public class DonorDetails {
	public String donorId;
	public String donorName;
	public String bloodType;
	public String donorAddress;
	public String donorMail;
	public Long donorPhoneNo;
	public int active;
	public LocalDate lastDonatedOn;
	
	public DonorDetails() {
		System.out.println("Constructor");
	}

	public DonorDetails(String donorId, String donorName, String bloodType, String donorAddress, String donorMail,
			Long donorPhoneNo, int active, LocalDate lastDonatedOn) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.bloodType = bloodType;
		this.donorAddress = donorAddress;
		this.donorMail = donorMail;
		this.donorPhoneNo = donorPhoneNo;
		this.active = active;
		this.lastDonatedOn = lastDonatedOn;
	}

	@Override
	public String toString() {
		return "DonorDetails [donorId=" + donorId + ", donorName=" + donorName + ", bloodType=" + bloodType
				+ ", donorAddress=" + donorAddress + ", donorMail=" + donorMail + ", donorPhoneNo=" + donorPhoneNo
				+ ", active=" + active + ", lastDonatedOn=" + lastDonatedOn + "]";
	}
	
}
