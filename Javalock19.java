package CovdTrace2;

import java.util.Scanner;

public class Javalock19 {

	public static void main(String[] args) {
		Inserts();
	}

	private static void Inserts() {
		Scanner sc;
		sc = new Scanner(System.in);
		boolean flag = true;
		while(flag == true) {

		System.out.println("Welcome to our Covid Test Center");

		System.out.println("Select action :");
		System.out.println("1. Print all Patients");
		System.out.println("2. Add a Patient");
		System.out.println("3. Search a Patient");
		System.out.println("4. Delete a Patient");
		//System.out.println("3.Search and edit Person Status");
		//System.out.println("4.Search based on Covid");
		System.out.println("5. Log out");


		int option;
		option = sc.nextInt();
		switch(option) {

		case 1: option = 1;
		PrintPatients.printPatients();
		break;

		case 2: option = 2;
		NewPatient.addPatient();
		break;

		case 3: option = 3;
		SearchPatient.searchPatient();
		break;

		case 4: option = 4;
		int i = SearchPatient.searchPatient();
		if(i != -1) {
			DeletePatient.deletePatient(i);
		}
		break;

		/*case 4: option = 4;
		SchoolYear.findSchoolyear();
		break;
		case 5: option = 5;
		Teacher.printTeachers();
		break;
		case 6: option = 6;
		Teacher.findAmka();*/
		//break;
		case 5: option = 5;
		System.out.println("Our Covid Test Center is closed for today!");
		flag = false;
		break;
		default:
		System.out.println("Your choice wasn't found.Enter an option [1-6]:");
		break;
		}

	  }

	}

}
