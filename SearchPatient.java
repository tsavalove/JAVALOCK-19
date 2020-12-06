package CovdTrace2;

import java.util.Scanner;

public class SearchPatient {

	public static void searchPatient() {
		System.out.println("Select action :");
		System.out.println("1. Search with name");
		System.out.println("2. Search with id");
		System.out.println("3. Search with telnumb");

		int option;
		int flag = 0;
		Scanner sc;
		sc = new Scanner(System.in);

		option = sc.nextInt();
		switch (option) {

		case 1:
			option = 1;
			System.out.println("Search with name and surname");
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter name");
			String name = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Enter surname");
			String surname = sc2.nextLine();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getName().equals(name) && Patient.patients[i].getSurname().equals(surname)) {
					System.out.println("Name:" + Patient.patients[i].getName() + " " + "Surname:" + Patient.patients[i].getSurname() + " " + "Id:" + Patient.patients[i].getId() + " "
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + " " + "Adress:" + Patient.patients[i].getAdress() + " " + "Date of Birth:" + Patient.patients[i].getDob());
					flag = 1;
					break;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
			}

			break;

		case 2:
			option = 2;
			System.out.println("Search with id");
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter id");
			int id = sc3.nextInt();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getId() == id) {
					System.out.println("Name:" + Patient.patients[i].getName() + " " + "Surname:" + Patient.patients[i].getSurname() + " " + "Id:" + Patient.patients[i].getId() + " "
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + " " + "Adress:" + Patient.patients[i].getAdress() + " " + "Date of Birth:" + Patient.patients[i].getDob());
					flag = 1;
					break;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
			}

			break;
		case 3:
			option = 2;
			System.out.println("Search with phonenumber");
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Enter phonenumber");
			int phonenum = sc4.nextInt();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getPhonenum() == phonenum) {
					System.out.println("Name:" + Patient.patients[i].getName() + " " + "Surname:" + Patient.patients[i].getSurname() + " " + "Id:" + Patient.patients[i].getId() + " "
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + " " + "Adress:" + Patient.patients[i].getAdress() + " " + "Date of Birth:" + Patient.patients[i].getDob());
					flag = 1;
					break;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
			}
			break;
		}

	}
}