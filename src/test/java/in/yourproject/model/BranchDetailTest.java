package in.yourproject.model;
import java.time.LocalDate;
public class BranchDetailTest {
	public static void main(String[] args) {

		
        
		LocalDate event1 = LocalDate.parse("2019-05-24");
		LocalDate event2 = LocalDate.parse("2019-08-19");
		LocalDate event3 = LocalDate.parse("2019-12-08");
		LocalDate event4 = LocalDate.parse("2019-03-22");
		LocalDate event5 = LocalDate.parse("2019-03-09");
		LocalDate event6 = LocalDate.parse("2019-07-06");
		
		BranchDetail branchNo1= new BranchDetail("E003","B004",event1);  
		System.out.println(branchNo1.toString());                     
		                                                               
		BranchDetail branchNo2= new BranchDetail("E005","B005",event2);  
		System.out.println(branchNo2.toString());                     
		                                                               
		BranchDetail branchNo3= new BranchDetail("E001","B005",event3);  
		System.out.println(branchNo3.toString());                     
		                                                               
		BranchDetail branchNo4= new BranchDetail("E002","B006",event4);  
		System.out.println(branchNo4.toString());                     
		                                                               
		BranchDetail branchNo5= new BranchDetail("E004","B002",event5);
		System.out.println(branchNo5.toString());                     
		                                                               
		BranchDetail branchNo6= new BranchDetail("E006","B001",event6);
		System.out.println(branchNo6.toString());                     
		                
	}                                                                      
	


}
