package CovdTrace2;

import java.util.Scanner;

public class PrintContacts {

	public static void printContacts() {
		int flag = 0;
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Input patient Id: ");
		int patientId = sc.nextInt();
		for (int i = 0; i < Patient.patients.length; i++) {
			for (int j = 0; j < Contact.contacts.length; j++) {
					if(Patient.patients[i] != null && Contact.contacts[j] != null && (Patient.patients[i].getId() == patientId) && (Contact.contacts[j].getPatientId() == patientId)) {
						System.out.println(Contact.contacts[j].toString());
						flag = 1;
					}

			}

		}

		if (flag == 0) {
			System.out.println("The patient not found!");
		}

	}

}
