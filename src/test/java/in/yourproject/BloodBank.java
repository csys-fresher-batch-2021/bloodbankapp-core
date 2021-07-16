package in.yourproject;

import java.time.LocalDate;

public class BloodBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient patient1 = new Patient("POO6", "Aniq", "O-", "No 2:subash chandra bose street villupuram",
				"aniq7@yahoo.com", 9894528445l);
		Patient patient2 = new Patient("POO4", "Liyana", "O+", "No 62:madam street chennai", "lieyana@gmail.com",
				9894504844l);
		Patient patient3 = new Patient("POO3", "Yusri", "O-", "No 98:Adyar chennai", "yuss04@gmail.com", 9922089333l);
		Patient patient4 = new Patient("POO5", "Nabil", "B-", "No 21:Kaveripakkam", "nabil@yahoo.com", 8822098761l);
		Patient patient5 = new Patient("POO1", "Intan", "A+", "No 5 Tirunelveli", "intann@gmail.com", 9894044921l);
		Patient patient6 = new Patient("POO2", "Nadhirah", "AB-", "No 58 tuticorin", "nanad11@gmail.com", 6654321880l);

		System.out.println(patient1);
		System.out.println(patient2);
		System.out.println(patient3);
		System.out.println(patient4);
		System.out.println(patient5);
		System.out.println(patient6);

		LocalDate event1 = LocalDate.parse("2019-08-15");
		LocalDate event2 = LocalDate.parse("2019-03-24");
		LocalDate event3 = LocalDate.parse("2019-05-27");
		LocalDate event4 = LocalDate.parse("2019-01-13");
		LocalDate event5 = LocalDate.parse("2019-08-23");
		LocalDate event6 = LocalDate.parse("2019-07-24");

		BloodReceivedPatientInformation information1 = new BloodReceivedPatientInformation("POO3", "BL02", event1, 1);
		BloodReceivedPatientInformation information2 = new BloodReceivedPatientInformation("POO1", "BL06", event2, 1);
		BloodReceivedPatientInformation information3 = new BloodReceivedPatientInformation("POO2", "BL04", event3, 1);
		BloodReceivedPatientInformation information4 = new BloodReceivedPatientInformation("POO4", "BL01", event4, 2);
		BloodReceivedPatientInformation information5 = new BloodReceivedPatientInformation("POO6", "BL03", event5, 1);
		BloodReceivedPatientInformation information6 = new BloodReceivedPatientInformation("POO5", "BL05", event6, 1);

		System.out.println(information1);
		System.out.println(information2);
		System.out.println(information3);
		System.out.println(information4);
		System.out.println(information5);
		System.out.println(information6);

	}

}
