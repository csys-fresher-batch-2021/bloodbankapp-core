package in.yourproject.model;
 import java.time.LocalDate;

public class BranchDetail {
	public String eventId;
	public String branchNo;
	public LocalDate eventDate;
	public BranchDetail() {
		System.out.println("Constructor");

}
	public BranchDetail(String eventId, String branchNo, LocalDate eventDate) {
		super();
		this.eventId = eventId;
		this.branchNo = branchNo;
		this.eventDate = eventDate;
	}

@Override
public String toString() {
	return "BranchDetails [eventId=" + eventId + ", branchNo=" + branchNo + ",eventDate=" + eventDate + "]";
	
}

}