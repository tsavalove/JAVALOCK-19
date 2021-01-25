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
		System.out.println("Did he a mask? Type yes or no");
		String mask = sc.nextLine();
		String mask1 = "yes";
		String mask2 = "no";

		while(mask.equals(mask1) == false && mask.equals(mask2)== false) {

			System.out.println("Your choice wasn't found. Type yes or no");
			mask = sc.nextLine();
		}
		System.out.println("Please complete patient's symptoms");
		System.out.println("Did he have cough? Type yes or no");
		String cough = sc.nextLine();
		String cough1 = "yes";
		String cough2 = "no";

		while(cough.equals(cough1) == false && cough.equals(cough2)== false) {

			System.out.println("Your choice wasn't found. Type yes or no");
			cough = sc.nextLine();
		}
		System.out.println("Did he have fever? Type yes or no");
		String fever = sc.nextLine();
		String fever1 = "yes";
		String fever2 = "no";

		while(fever.equals(fever1) == false && fever.equals(fever2)== false) {

			System.out.println("Your choice wasn't found. Type yes or no");
			fever = sc.nextLine();
		}
		System.out.println("Did he have tiredness? Type yes or no");
		String tiredness = sc.nextLine();
		String tiredness1 = "yes";
		String tiredness2 = "no";

		while(tiredness.equals(tiredness1) == false && tiredness.equals(tiredness2)== false) {

			System.out.println("Your choice wasn't found. Type yes or no");
			tiredness = sc.nextLine();
		}
		System.out.println("Did he have difficulty breathing? Type yes or no");
		String difficultybreathing = sc.nextLine();
		String difficultybreathing1 = "yes";
		String difficultybreathing2 = "no";

		while(difficultybreathing.equals(difficultybreathing1) == false && difficultybreathing.equals(difficultybreathing2)== false) {

			System.out.println("Your choice wasn't found. Type yes or no");
			difficultybreathing = sc.nextLine();
		}
		new Contact(patientId, name, surname, adress, phonenum, sex, numID, amka, afm, mask, cough, fever, tiredness, difficultybreathing);
		System.out.println("A new contact has been created!");

	}

}
