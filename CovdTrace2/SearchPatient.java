package CovdTrace2;

import java.util.Scanner;

public class SearchPatient {

	public static int searchPatient() {
		System.out.println("Select action :");
		System.out.println("1. Search with patient's name and surname");
		System.out.println("2. Search with patient's Id");
		System.out.println("3. Search with patient's telnumb");
		System.out.println("4. Search with patient's number ID");
		System.out.println("5. Search with patient's amka");
		System.out.println("6. Search with patient's afm");


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
			System.out.println("Enter patient's name");
			String name = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Enter patient's surname");
			String surname = sc2.nextLine();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getName().equals(name) && Patient.patients[i].getSurname().equals(surname)) {
					System.out.println("Name:" + Patient.patients[i].getName() + "\n" + "Surname:" + Patient.patients[i].getSurname() + "\n" + "Id:#" + Patient.patients[i].getId() + "\n"
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + "\n" + "Adress:" + Patient.patients[i].getAdress() + "\n" + "Date of Birth:" + Patient.patients[i].getDob()+ " "
					+ "Sex:" + Patient.patients[i].getSex()+ "\n" + "Number ID:" + Patient.patients[i].getNumID()+ "\n" + "Amka:" + Patient.patients[i].getAmka()+ " "
					+ "Afm:" + Patient.patients[i].getAfm()+ "\n" + "Mask:" + Patient.patients[i].getMask()+ "\n" + "Symptoms: " + "\n" + "Cough:" + Patient.patients[i].getCough()+ "\n"
					+ "Fever:" + Patient.patients[i].getFever()+ "\n" + "Tiredness:" + Patient.patients[i].getTiredness()+ "\n"
					+ "Difficultybreathing:" + Patient.patients[i].getDifficultybreathing());
					flag = 1;
					return i;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
				return -1;
			}

			break;

		case 2:
			option = 2;
			System.out.println("Search with Id");
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter patient's Id");
			int id = sc3.nextInt();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getId() == id) {
					System.out.println("Name:" + Patient.patients[i].getName() + "\n" + "Surname:" + Patient.patients[i].getSurname() + "\n" + "Id:#" + Patient.patients[i].getId() + "\n"
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + "\n" + "Adress:" + Patient.patients[i].getAdress() + "\n" + "Date of Birth:" + Patient.patients[i].getDob()+ "\n"
					+ "Sex:" + Patient.patients[i].getSex()+ "\n" + "Number ID:" + Patient.patients[i].getNumID()+ "\n" + "Amka:" + Patient.patients[i].getAmka()+ "\n"
					+ "Afm:" + Patient.patients[i].getAfm()+ "\n" + "Mask:" + Patient.patients[i].getMask()+ "\n" + "Symptoms: " + "\n" + "Cough:" + Patient.patients[i].getCough()+ "\n"
					+ "Fever:" + Patient.patients[i].getFever()+ "\n" + "Tiredness:" + Patient.patients[i].getTiredness()+ "\n"
					+ "Difficultybreathing:" + Patient.patients[i].getDifficultybreathing());
					flag = 1;
					return i;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
				return -1;
			}

			break;
		case 3:
			option = 3;
			System.out.println("Search with phonenumber");
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Enter patient's phonenumber");
			String phonenum = sc4.nextLine();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getPhonenum().equals(phonenum)) {
					System.out.println("Name:" + Patient.patients[i].getName() + "\n" + "Surname:" + Patient.patients[i].getSurname() + "\n" + "Id:#" + Patient.patients[i].getId() + "\n"
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + "\n" + "Adress:" + Patient.patients[i].getAdress() + "\n" + "Date of Birth:" + Patient.patients[i].getDob()+ "\n"
					+ "Sex:" + Patient.patients[i].getSex()+ "\n" + "Number ID:" + Patient.patients[i].getNumID()+ "\n" + "Amka:" + Patient.patients[i].getAmka()+ "\n"
					+ "Afm:" + Patient.patients[i].getAfm()+ "\n" + "Mask:" + Patient.patients[i].getMask()+ "\n" + "Symptoms: " + "\n" + "Cough:" + Patient.patients[i].getCough()+ "\n"
					+ "Fever:" + Patient.patients[i].getFever()+ "\n" + "Tiredness:" + Patient.patients[i].getTiredness()+ " "
					+ "Difficultybreathing:" + Patient.patients[i].getDifficultybreathing());
					flag = 1;
					return i;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
				return -1;
			}
			break;
		case 4:
			option = 4;
			System.out.println("Search with number ID");
			Scanner sc5 = new Scanner(System.in);
			System.out.println("Enter patient's number ID");
			String numID = sc5.nextLine();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getNumID().equals(numID)) {
					System.out.println("Name:" + Patient.patients[i].getName() + "\n" + "Surname:" + Patient.patients[i].getSurname() + "\n" + "Id:#" + Patient.patients[i].getId() + "\n"
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + "\n" + "Adress:" + Patient.patients[i].getAdress() + "\n" + "Date of Birth:" + Patient.patients[i].getDob()+ "\n"
					+ "Sex:" + Patient.patients[i].getSex()+ "\n" + "Number ID:" + Patient.patients[i].getNumID()+ "\n" + "Amka:" + Patient.patients[i].getAmka()+ "\n"
					+ "Afm:" + Patient.patients[i].getAfm()+ "\n" + "Mask:" + Patient.patients[i].getMask()+ "\n" + "Symptoms: " + "\n" + "Cough:" + Patient.patients[i].getCough()+ "\n"
					+ "Fever:" + Patient.patients[i].getFever()+ "\n" + "Tiredness:" + Patient.patients[i].getTiredness()+ "\n"
					+ "Difficultybreathing:" + Patient.patients[i].getDifficultybreathing());
					flag = 1;
					return i;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
				return -1;
			}
			break;
		case 5:
			option = 5;
			System.out.println("Search with amka");
			Scanner sc6 = new Scanner(System.in);
			System.out.println("Enter patient's amka");
			String amka = sc6.nextLine();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getAmka().equals(amka)) {
					System.out.println("Name:" + Patient.patients[i].getName() + "\n" + "Surname:" + Patient.patients[i].getSurname() + "\n" + "Id:#" + Patient.patients[i].getId() + "\n"
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + "\n" + "Adress:" + Patient.patients[i].getAdress() + "\n" + "Date of Birth:" + Patient.patients[i].getDob()+ "\n"
					+ "Sex:" + Patient.patients[i].getSex()+ "\n" + "Number ID:" + Patient.patients[i].getNumID()+ "\n" + "Amka:" + Patient.patients[i].getAmka()+ "\n"
					+ "Afm:" + Patient.patients[i].getAfm()+ "\n" + "Mask:" + Patient.patients[i].getMask()+ "\n" + "Symptoms: " + "\n" + "Cough:" + Patient.patients[i].getCough()+ "\n"
					+ "Fever:" + Patient.patients[i].getFever()+ "\n" + "Tiredness:" + Patient.patients[i].getTiredness()+ " "
					+ "Difficultybreathing:" + Patient.patients[i].getDifficultybreathing());
					flag = 1;
					return i;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
				return -1;
			}
			break;
		case 6:
			option = 6;
			System.out.println("Search with afm");
			Scanner sc7 = new Scanner(System.in);
			System.out.println("Enter patient's afm");
			String afm = sc7.nextLine();
			for (int i = 0; i < Patient.patients.length; i++) {
				if (Patient.patients[i] != null && Patient.patients[i].getAfm().equals(afm)) {
					System.out.println("Name:" + Patient.patients[i].getName() + "\n" + "Surname:" + Patient.patients[i].getSurname() + "\n" + "Id:#" + Patient.patients[i].getId() + "\n"
					+ "TelNumber:" + Patient.patients[i].getPhonenum() + "\n" + "Adress:" + Patient.patients[i].getAdress() + "\n" + "Date of Birth:" + Patient.patients[i].getDob()+ "\n"
					+ "Sex:" + Patient.patients[i].getSex()+ "\n" + "Number ID:" + Patient.patients[i].getNumID()+ "\n" + "Amka:" + Patient.patients[i].getAmka()+ "\n"
					+ "Afm:" + Patient.patients[i].getAfm()+ "\n" + "Mask:" + Patient.patients[i].getMask()+ "\n" + "-------------------- " + "Symptoms Details: " + "--------------------\n" + "Cough:" + Patient.patients[i].getCough()+ "\n"
					+ "Fever:" + Patient.patients[i].getFever()+ "\n" + "Tiredness:" + Patient.patients[i].getTiredness()+ "\n"
					+ "Difficultybreathing:" + Patient.patients[i].getDifficultybreathing());
					flag = 1;
					return i;

				}

			}

			if (flag == 0) {
				System.out.println("The patient not found!");
				return -1;
			}
			break;
		}

		return -1;

	}
}
