package CovdTrace2;

import java.util.Scanner;

public class PrintPatients {

	public static void printPatients() {
		for(int i = 0; i < Patient.patients.length; i++) {
			if(Patient.patients[i] != null) {
				System.out.println("Name:" + Patient.patients[i].getName() + "\n" + "Surname:" + Patient.patients[i].getSurname() + "\n" + "Id:#" + Patient.patients[i].getId() + "\n"
				+ "TelNumber:" + Patient.patients[i].getPhonenum() + "\n" + "Adress:" + Patient.patients[i].getAdress() + "\n" + "Date of Birth:" + Patient.patients[i].getDob()+ "\n"
				+ "Sex:" + Patient.patients[i].getSex()+ "\n" + "Number ID:" + Patient.patients[i].getNumID()+ "\n" + "Amka:" + Patient.patients[i].getAmka()+ "\n"
				+ "Afm:" + Patient.patients[i].getAfm()+ "\n" + "Mask:" + Patient.patients[i].getMask()+ "\n" +"-------------------- " + "Symptoms Details: " + "--------------------\n" + "Cough:" + Patient.patients[i].getCough()+ "\n"
				+ "Fever:" + Patient.patients[i].getFever()+ "\n" + "Tiredness:" + Patient.patients[i].getTiredness()+ "\n"
				+ "Difficultybreathing:" + Patient.patients[i].getDifficultybreathing() + "\nNext Patient:");
				System.out.println();
				
			}
			
		}
	}

}
