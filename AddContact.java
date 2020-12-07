package CovdTrace2;

import java.util.Scanner;

public class AddContact {

	public static void addContact() {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Input patient Id: ");
		int patientId = sc.nextInt();
		sc.nextLine();
		System.out.println("Input name: ");
		String name = sc.nextLine();
		System.out.println("Input surname: ");
		String surname = sc.nextLine();
		System.out.println("Input adress: ");
		String adress = sc.nextLine();
		System.out.println("Input phonenumber: ");
		int phonenum = sc.nextInt();
		new Contact(patientId, name, surname, adress, phonenum);
		System.out.println("A new contact has been created!");

	}

}
