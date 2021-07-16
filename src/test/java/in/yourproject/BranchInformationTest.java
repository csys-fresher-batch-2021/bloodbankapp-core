package in.yourproject;
import in.yourproject.BranchInformation;
public class BranchInformationTest {
public static void main(String[] args) {
        
		
	BranchInformation branchInfo1= new BranchInformation("B002","Pallavan street","Kanchipuram","631501");
		System.out.println(branchInfo1.toString());
		
		BranchInformation branchInfo2= new BranchInformation("B003","mettu street","Kanchipuram","631501");
		System.out.println(branchInfo2.toString());
		
		BranchInformation branchInfo3= new BranchInformation("B001","royapet","chennai","600014");
		System.out.println(branchInfo3.toString());
		
		BranchInformation branchInfo4= new BranchInformation("B004","Ponniamman street","chennai","600002");
		System.out.println(branchInfo4.toString());
		
		BranchInformation branchInfo5= new BranchInformation("B005","kandhi street","trichy","620001");
		System.out.println(branchInfo5.toString());
		
		BranchInformation branchInfo6= new BranchInformation("B006","Adhavan street","tuticorin","628001");
		System.out.println(branchInfo6.toString());
	
}
}