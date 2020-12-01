package CovdTrace2;

import java.util.Scanner;
//PATIENT WITH METHODS
public class Patient {
	protected static Patient[] patients = new Patient[100];
	private String name;
	private String surname;

	public String dob;// date of birth//
	public String adress;
	private int id;
	private static int count;
	public int phonenum;

	public Patient(String name, String surname, String dob, String adress, int phonenum) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		this.phonenum = phonenum;
		patients[count] = this;

		count++;
		id = count;
	}

	public static void addPatients() {

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc2.nextLine();
		System.out.println("-----------------------");
		System.out.println("Enter surname");
		String surname = sc2.nextLine();
		System.out.println("-----------------------");
		System.out.println("Enter dob");
		String dob = sc2.nextLine();
		System.out.println("-----------------------");
		System.out.println("Enter adress");
		String adress = sc2.nextLine();
		System.out.println("-----------------------");
		System.out.println("Please enter the phone number");
		Scanner sc3 = new Scanner(System.in);
		int phonenum = sc3.nextInt();
		// TODO Auto-generated method stub
		Patient e1 = new Patient(name, surname, dob, adress, phonenum);
		for (int i = 0; i < patients.length; i++) {
			if(patients[i] == null) {
				patients[i] =e1;
				break;
			}
		}

		System.out.println("The Employee has been added to the system");
		System.out.println("Name:" + e1.name + " " + "Surname:" + e1.surname + " " + "Id:" + e1.getId() + " "
				+ "TelNumber:" + e1.phonenum);

	}

	private int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public static void searchPatient() {
		System.out.println("Select action :");
		System.out.println("1.Search with name");
		System.out.println("2. Search with id");
		System.out.println("3. Search with telnumb");

		int option;
		Scanner sc;
		sc = new Scanner(System.in);

		option = sc.nextInt();
		switch (option) {

		case 1:
			option = 1;
			System.out.println("Search name surname");
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter name");
			String name = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Enter surname");
			String surname = sc2.nextLine();
			int i;
			for (i = 0; i < patients.length; i++) {
				if (patients[i] != null && name.equals(name) && surname.equals(surname)) {
					System.out.println(patients[i].getName() + patients[i].getSurname());
					break;

				}

			}

			if (i == patients.length) {
				{
					System.out.println("error");
				}

			}

			break;

		
		case 2:
			option = 2;
			Patient.searchPatient();
			break;
		}

	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getSurname() {
		// TODO Auto-generated method stub
		return this.surname;
	}

}
