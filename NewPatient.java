package CovdTrace2;
import java.io.IOException;
import java.lang.Exception;
import java.util.Scanner;

public class NewPatient {

	public static void addPatient() {
try {
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
		String phonenum = sc2.nextLine();
		// TODO Auto-generated method stub
		Patient e1 = new Patient(name, surname, dob, adress, phonenum);

		System.out.println("The Employee has been added to the system");
		System.out.println("Name:" + e1.getName() + " " + "Surname:" + e1.getSurname() + " " + "Id:" + e1.getId() + " "
		+ "TelNumber:" + e1.getPhonenum() + " " + "Adress:" + e1.getAdress() + " " + "Date of Birth:" + e1.getDob());
} catch (Exception InputMismatchException) {
	//TODO: handle exception
	System.out.println("Problem with the phonenumber");
	/*

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
		int phonenum = sc2.nextInt();
		// TODO Auto-generated method stub
		Patient e1 = new Patient(name, surname, dob, adress, phonenum);
		System.out.println("The Employee has been added to the system");
		System.out.println("Name:" + e1.getName() + " " + "Surname:" + e1.getSurname() + " " + "Id:" + e1.getId() + " "
		+ "TelNumber:" + e1.getPhonenum() + " " + "Adress:" + e1.getAdress() + " " + "Date of Birth:" + e1.getDob());
		*/
	}
}
}