package in.yourproject;

public class BranchInformation {
	public String branchNo;
	public String street;
	public String city;
	public String postcode;
	public BranchInformation() {
		System.out.println("Constructor");
		
}
	public BranchInformation(String branchNo, String street, String city, String postcode) {
		super();
		this.branchNo = branchNo;
		this.street = street;
		this.city = city;
		this.postcode = postcode;
	}
	@Override
	public String toString() {
		return "BranchInformation [branchNo=" + branchNo + ", street=" + street + ", city=" + city +", postcode=" + postcode +"]";
		
}
}