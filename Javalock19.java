package CovdTrace2;

import java.util.Scanner;

public class Javalock19 {

	public static void main(String[] args) {
		Inserts();
	}

	private static void Inserts() {
		Scanner sc;
		sc = new Scanner(System.in);
		while(true){

		System.out.println("Welcome to our Covid Test Center");

		System.out.println("Select action :");
		System.out.println("1.Add a Patient");
		System.out.println("2.Search a Patient");
		//System.out.println("3.Search and edit Person Status");
		//System.out.println("4.Search based on Covid");
		System.out.println("3.Log out");


		int option;
		option = sc.nextInt();
		switch(option){

		case 1: option = 1;
		NewPatient.addPatient();
		break;

		case 2: option = 2;
		SearchPatient.searchPatient();
		break;
		/*case 3: option = 3;
		SchoolYear.findId();
		break;
		case 4: option = 4;
		SchoolYear.findSchoolyear();
		break;
		case 5: option = 5;
		Teacher.printTeachers();
		break;
		case 6: option = 6;
		Teacher.findAmka();*/
		//break;
		default:
		//System.out.println("Η επιλογή σας δε βρέθηκε.Εισάγετε επιλογή [1-6]:");
		break;
		}
	}}}


