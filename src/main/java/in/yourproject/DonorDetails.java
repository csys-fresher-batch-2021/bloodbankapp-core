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

	public String getDonorId() {
		return donorId;
	}

	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getDonorAddress() {
		return donorAddress;
	}

	public void setDonorAddress(String donorAddress) {
		this.donorAddress = donorAddress;
	}

	public String getDonorMail() {
		return donorMail;
	}

	public void setDonorMail(String donorMail) {
		this.donorMail = donorMail;
	}

	public Long getDonorPhoneNo() {
		return donorPhoneNo;
	}

	public void setDonorPhoneNo(Long donorPhoneNo) {
		this.donorPhoneNo = donorPhoneNo;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public LocalDate getLastDonatedOn() {
		return lastDonatedOn;
	}

	public void setLastDonatedOn(LocalDate lastDonatedOn) {
		this.lastDonatedOn = lastDonatedOn;
	}
	
}
