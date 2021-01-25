package CovdTrace2;

import java.util.Scanner;

public class AddContact {

	public static void addContact() {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Input patient's Id: ");
		int patientId = sc.nextInt();
		sc.nextLine();
		System.out.println("Input name: ");
		String name = sc.nextLine();
		System.out.println("Input surname: ");
		String surname = sc.nextLine();
		System.out.println("Input adress: ");
		String adress = sc.nextLine();
		System.out.println("Input phonenumber: ");
		String phonenum = sc.nextLine();
		System.out.println("Input sex");
		String sex = sc.nextLine();
		System.out.println("Input number ID");
		String numID = sc.nextLine();
		System.out.println("Input amka");
		String amka = sc.nextLine();
		System.out.println("Input afm");
		String afm = sc.nextLine();
		System.out.println("Did you wear a mask? Type yes or no");
		String mask = sc.nextLine();
		String mask1 = "yes";
		String mask2 = "no";

		while(mask.equals(mask1) == false && mask.equals(mask2)== false) {

			System.out.println("Your choice wasn't found. Type yes or no");
			mask = sc.nextLine();
		}
		new Contact(patientId, name, surname, adress, phonenum, sex, numID, amka, afm, mask);
		System.out.println("A new contact has been created!");

	}

}
