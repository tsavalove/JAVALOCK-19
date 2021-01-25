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
			System.out.println("Please complete patient's symptoms");
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

			System.out.println("The Employee has been added to the system");
			System.out.println("Name:" + e1.getName() + " " + "Surname:" + e1.getSurname() + " " + "Id:" + e1.getId() + " "
			+ "TelNumber:" + e1.getPhonenum() + " " + "Adress:" + e1.getAdress() + " " + "Date of Birth:" + e1.getDob()+ " "
			+ "Sex:" + e1.getSex()+ " " + "Number ID:" + e1.getNumID()+ " " + "Amka:" + e1.getAmka()+ " "
			+ "Afm:" + e1.getAfm()+ " " + "Mask:" + e1.getMask()+ " " + "Symptoms: " + " " + "Cough:" + e1.getCough()+ " "
			+ "Fever:" + e1.getFever()+ " " + "Tiredness:" + e1.getTiredness()+ " " + "Difficultybreathing:" + e1.getDifficultybreathing());
	} catch (Exception InputMismatchException) {

		//TODO: handle exception
		System.out.println("Problem with the phonenumber");

	}
}

}
