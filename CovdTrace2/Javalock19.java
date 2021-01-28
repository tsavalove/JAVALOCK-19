package CovdTrace2;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Javalock19 {

	public static void main(String[] args) {
		try {
			Inserts();
		} catch (Exception inputMismatchException) {
			//TODO: handle exception
			System.out.println("Wrong input choice, try again!");
			System.out.println();
			Inserts();
		}
		
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
		System.out.println("5. Add Contacts");
		System.out.println("6. Print Contacts");
		System.out.println("7. Log out");


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

		case 5: option = 5;
		AddContact.addContact();
		break;

		case 6: option = 6;
		PrintContacts.printContacts();
		break;

		case 7: option = 7;
		System.out.println("Thank you for entering.\nOur Covid Test Center will close.\nHave a nice day!");
		flag = false;
		break;
		default:
		System.out.println("Your choice wasn't found.Enter an option [1-7]:");
		break;
		}

		}
	//End inserts
  }//End main
}