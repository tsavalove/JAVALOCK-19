package CovdTrace2;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Javalock19 {
	/* Making an array list for Patients and Contacts
	 * @param name, surname, dob, adress, phonenum, sex, numID, amka, afm, mask, cough, fever, tiredness, difficultybreathing
	 * 14 in Total 
	 * 
	 * */
	private static void Create(){
		List<Patient> patientList = new ArrayList<Patient>();
		List<Contact> contactList = new ArrayList<Contact>();
		patientList.add(new Patient("Alex","Tsavalos","28/3/1996","Komnhnwn 54","694894446", "Male" ,"1", "28039602413", "166059568", "yes", "yes", "yes", "yes", "yes" ));
		


	}//end create

	public static void main(String[] args) {
		try {
			Create();
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
		System.out.println();
		PrintPatients.printPatients();
		System.out.println();
		break;

		case 2: option = 2;
		NewPatient.addPatient();
		System.out.println();
		break;

		case 3: option = 3;
		SearchPatient.searchPatient();
		System.out.println();
		break;

		case 4: option = 4;
		int i = SearchPatient.searchPatient();
		System.out.println();
		if(i != -1) {
			DeletePatient.deletePatient(i);
			System.out.println();
		}
		break;

		case 5: option = 5;
		AddContact.addContact();
		System.out.println();
		break;

		case 6: option = 6;
		PrintContacts.printContacts();
		System.out.println();
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