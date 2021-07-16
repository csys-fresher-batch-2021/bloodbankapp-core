package in.yourproject;

import java.time.LocalDate;

public class BloodReceivedPatientInformation {

	public String patientId;
	public String bloodId;
	public LocalDate bloodDate;
	public int quantity;

	public BloodReceivedPatientInformation(String patientId, String bloodId, LocalDate bloodDate, int quantity) {
		super();
		this.patientId = patientId;
		this.bloodId = bloodId;
		this.bloodDate = bloodDate;
		this.quantity = quantity;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getBloodId() {
		return bloodId;
	}

	public void setBloodId(String bloodId) {
		this.bloodId = bloodId;
	}

	public LocalDate getBloodDate() {
		return bloodDate;
	}

	public void setBloodDate(LocalDate bloodDate) {
		this.bloodDate = bloodDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "BloodReceivedPatientInformation [patientId=" + patientId + ", bloodId=" + bloodId + ", bloodDate="
				+ bloodDate + ", quantity=" + quantity + "]";
	}

}
