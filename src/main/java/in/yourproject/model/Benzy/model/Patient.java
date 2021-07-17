package in.yourproject.model;

public class Patient {

	public String patientId;
	public String patientName;
	public String bloodType;
	public String patientAddress;
	public String patientEmail;
	
	public Long patientPhoneNo;

	public Patient(String patientId, String patientName, String bloodType, String patientAddress, String patientEmail,
			Long patientPhoneNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.bloodType = bloodType;
		this.patientAddress = patientAddress;
		this.patientEmail = patientEmail;
		this.patientPhoneNo = patientPhoneNo;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public Long getPatientPhoneNo() {
		return patientPhoneNo;
	}

	public void setPatientPhoneNo(Long patientPhoneNo) {
		this.patientPhoneNo = patientPhoneNo;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", bloodType=" + bloodType
				+ ", patientAddress=" + patientAddress + ", patientEmail=" + patientEmail + ", patientPhoneNo="
				+ patientPhoneNo + "]";
	}

}
