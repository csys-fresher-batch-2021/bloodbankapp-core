package in.yourproject.donordetailstest;
import in.yourproject.model.donordetails.DonorDetails;
import java.time.LocalDate;

public class DonorDetailsTest {

	public static void main(String[] args) {
		LocalDate lastDonated1 = LocalDate.parse("2020-05-20");
		DonorDetails donor1 = new DonorDetails("DOO3","Asyraff","A+","No 1:MK COMPLEX kanchipuram","asraf08@gmail.com",9899766556L,1,lastDonated1);
		System.out.println(donor1.toString());
		
		LocalDate lastDonated2 = LocalDate.parse("2020-09-13");
		DonorDetails donor2 = new DonorDetails("DOO4","Aina","AB-","No 49:Pallavan nagar chennai","aina@gmail.com",7899766556L,1,lastDonated2);
		System.out.println(donor2.toString());
		
		LocalDate lastDonated3 = LocalDate.parse("2019-03-21");
		DonorDetails donor3 = new DonorDetails("DOO5","Amira","O-","No 9:Tnagar chennai","mira124@gmail.com",9659766006L,1,lastDonated3);
		System.out.println(donor3.toString());
		
		LocalDate lastDonated4 = LocalDate.parse("2021-02-05");
		DonorDetails donor4 = new DonorDetails("DOO2","Aiman","O+","No 13:Vedhachalam nagar coimbatore","aiman11@gmail.com",6888766536L,1,lastDonated4);
		System.out.println(donor4.toString());
		
		LocalDate lastDonated5 = LocalDate.parse("2020-05-05");
		DonorDetails donor5 = new DonorDetails("DOO2","Aiman","O+","No 13:Vedhachalam nagar coimbatore","aiman11@gmail.com",6888766536L,1,lastDonated5);
		System.out.println(donor5.toString());
		
		LocalDate lastDonated6 = LocalDate.parse("2021-01-09");
		DonorDetails donor6 = new DonorDetails("DOO6","Daniel","B-","No 5:Greens garden nagercoil","nial@gmail.com",9004766556L,1,lastDonated6);
		System.out.println(donor6.toString());
	
		
	}
}
