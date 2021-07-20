package in.yourproject.donordetailstest;
import in.yourproject.DeleteDonorDAO;
import in.yourproject.DeleteDonorDAOImp;
import in.yourproject.DonorDetails;



public class DeleteDonorDAOTest {
	
	public static void main(String[] args) {

		DeleteDonorDAO deleteDAO = new DeleteDonorDAOImp();
		try {
			deleteDAO.delete(1);
			System.out.println("Successfully deleted product");
		} catch (Exception e) {
			String errorMessage = e.getMessage();
			System.out.println("Failure:" + errorMessage);
			e.printStackTrace();
		}
	}

}