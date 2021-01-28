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
		patientList.add(new Patient("Alex-Herve","Tsavalos","28/3/1996","Komnhnwn 54","694894446", "Male" ,"AZ 949544", "28039602413", "166059568", "yes", "yes", "yes", "yes", "yes" ));
		patientList.add(new Patient("Antonios","Ntokos","18/12/1994","Symmachidon 24 ","6984201312 ", "Male" ,"AZ 949545", "18129402413", "166059561", "yes", "no", "no", "yes", "yes" ));
		patientList.add(new Patient("Nektarios","Kasimatis","27/5/1997","Prousiotissis 14","6975634789", "Male" ,"AZ 949546", "27059702413", "166059562", "no", "yes", "yes", "yes", "yes" ));
		patientList.add(new Patient("Danai","Archontouli","17/6/1998","Zappa 3","6944989890", "Female" ,"AZ 949547", "17069802413", "166059569", "no", "yes", "yes", "yes", "yes" ));
		patientList.add(new Patient("Dimitrios","Adamou","10/10/1995","Amazwnwn 62","6978398273", "Male" ,"AZ 949548", "10109502413", "166059563", "no", "yes", "yes", "yes", "yes" ));
		patientList.add(new Patient("Alexandros","Zannis","28/3/1994","Komnhnwn 53","694894447", "Male" ,"AZ 949549", "28039602413", "166059568", "no", "yes", "yes", "yes", "yes" ));
		patientList.add(new Patient("Kwstas","Blikas","28/3/1998","Komnhnwn 52","694894448", "Male" ,"AZ 949541", "28039602412", "166059568", "yes", "no", "yes", "no", "yes" ));
		patientList.add(new Patient("Eirini-Pasxou","Naupliotou","28/3/1994","Komnhnwn 51","694894449", "Female" ,"AZ 949542", "28039602414", "166059568", "no", "yes", "yes", "no", "no" ));
		//Contact list
		contactList.add(new Contact(1,"Mike", "Kotsabasis", "Smyrnhs 9", "698160143", "Male", "AZ 949577", "12039202413", "1660057581", "yes", "yes", "no", "no", "yes"));
		contactList.add(new Contact(2,"Giorgos", "Kotsabasis", "Smyrnhs 9", "698160142", "Male", "AZ 949575", "12039202412", "1660057582", "yes", "yes", "no", "no", "yes"));
		contactList.add(new Contact(3,"Gerogia", "Kotsabasis", "Smyrnhs 9", "698160143", "Female", "AZ 949571", "12039202411", "1660057589", "yes", "yes", "no", "no", "yes"));
		contactList.add(new Contact(1,"Mikaela", "Flwrou", "Maurogenous Mantw 8A", "698150143", "Female", "AZ 949572", "12039202417", "1660057591", "no", "yes", "yes", "yes", "yes"));
		


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