package in.yourproject;
import in.yourproject.BranchInformation;
import in.yourproject.BranchInformationDao;
import in.yourproject.BranchInformationDaoImp;
public class BranchInformationDaoTest {
	public static void main(String[] args) {
		
		BranchInformation branchInfo = new BranchInformation("B016", "KK Nagar", "Pondicherry",6000008l);
		BranchInformationDao branchDao = new BranchInformationDaoImp();
		try {
			branchDao.save(branchInfo);
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Failure:" + errorMessage);
			e.printStackTrace();
		}
	}


}
