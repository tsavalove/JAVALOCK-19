package CovdTrace2;

import java.util.Scanner;

public class PrintPatients {

	public static void printPatients() {
		for(int i = 0; i < Patient.patients.length; i++) {
			if(Patient.patients[i] != null) {
				System.out.println("Name:" + Patient.patients[i].getName() + " " + "Surname:" + Patient.patients[i].getSurname() + " " + "Id:" + Patient.patients[i].getId() + " "
				+ "TelNumber:" + Patient.patients[i].getPhonenum() + " " + "Adress:" + Patient.patients[i].getAdress() + " " + "Date of Birth:" + Patient.patients[i].getDob()+ " "
				+ "Sex:" + Patient.patients[i].getSex()+ " " + "Number ID:" + Patient.patients[i].getNumID()+ " " + "Amka:" + Patient.patients[i].getAmka()+ " "
				+ "Afm:" + Patient.patients[i].getAfm()+ " " + "Mask:" + Patient.patients[i].getMask());
			}
		}
	}

}
