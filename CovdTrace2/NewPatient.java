package CovdTrace2;
import java.io.IOException;
import java.lang.Exception;
import java.util.Scanner;

public class NewPatient {

	public static void addPatient() {

		try {

			Scanner sc2 = new Scanner(System.in);
			System.out.println("Please enter patient's name");
			String name = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Please enter patient's surname");
			String surname = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Please enter patient's date of birth");
			String dob = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Please enter patient's adress");
			String adress = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Please enter patient's phone number");
			String phonenum = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Please enter patient's sex");
			String sex = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Please enter patient's number ID");
			String numID = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Please enter patient's amka");
			String amka = sc2.nextLine();
			System.out.println("-----------------------");
			System.out.println("Please enter patient's afm");
			String afm = sc2.nextLine();
			System.out.println("Did he wear a mask? Type yes or no");
			String mask = sc2.nextLine();
			String mask1 = "yes";
			String mask2 = "no";

			while(mask.equals(mask1) == false && mask.equals(mask2)== false) {

				System.out.println("Your choice wasn't found. Type yes or no");
				mask = sc2.nextLine();
			}
			System.out.println("It is important to know some extra details about the patients syptoms\nPlease complete patient's symptoms:");
			System.out.println("Did he have cough? Type yes or no");
			String cough = sc2.nextLine();
			String cough1 = "yes";
			String cough2 = "no";

			while(cough.equals(cough1) == false && cough.equals(cough2)== false) {

				System.out.println("Your choice wasn't found. Type yes or no");
				cough = sc2.nextLine();
			}
			System.out.println("Did he have fever? Type yes or no");
			String fever = sc2.nextLine();
			String fever1 = "yes";
			String fever2 = "no";

			while(fever.equals(fever1) == false && fever.equals(fever2)== false) {

				System.out.println("Your choice wasn't found. Type yes or no");
				fever = sc2.nextLine();
			}
			System.out.println("Did he have tiredness? Type yes or no");
			String tiredness = sc2.nextLine();
			String tiredness1 = "yes";
			String tiredness2 = "no";

			while(tiredness.equals(tiredness1) == false && tiredness.equals(tiredness2)== false) {

				System.out.println("Your choice wasn't found. Type yes or no");
				tiredness = sc2.nextLine();
			}
			System.out.println("Did he have difficulty breathing? Type yes or no");
			String difficultybreathing = sc2.nextLine();
			String difficultybreathing1 = "yes";
			String difficultybreathing2 = "no";

			while(difficultybreathing.equals(difficultybreathing1) == false && difficultybreathing.equals(difficultybreathing2)== false) {

				System.out.println("Your choice wasn't found. Type yes or no");
				difficultybreathing = sc2.nextLine();
			}
			// TODO Auto-generated method stub
			Patient e1 = new Patient(name, surname, dob, adress, phonenum, sex, numID, amka, afm, mask, cough, fever, tiredness, difficultybreathing);

			System.out.println("A new patient has been added to the system");
			System.out.println("Name:" + e1.getName() + "\n " + "Surname:" + e1.getSurname() + "\n " + "Id:" + e1.getId() + "\n "
			+ "TelNumber:" + e1.getPhonenum() + "\n " + "Adress:" + e1.getAdress() + " " + "Date of Birth:" + e1.getDob()+ "\n "
			+ "Sex:" + e1.getSex()+ "\n " + "Number ID:" + e1.getNumID()+ "\n " + "Amka:" + e1.getAmka()+ "\n "
			+ "Afm:" + e1.getAfm()+ " " + "Mask:" + e1.getMask()+ " " + "Symptoms: " + " " + "Cough:" + e1.getCough()+ "\n "
			+ "Fever:" + e1.getFever()+ "\n " + "Tiredness:" + e1.getTiredness()+ "\n " + "Difficultybreathing:" + e1.getDifficultybreathing());
	} catch (Exception InputMismatchException) {

		//TODO: handle exception
		System.out.println("Problem with input try again");

	}
}

}
