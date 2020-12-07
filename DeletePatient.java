package CovdTrace2;

import java.util.Scanner;

public class DeletePatient {

	public static void deletePatient(int patient) {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.println("Are you sure you want to delete this patient? Type yes or no");
		String verification;
		verification = sc.nextLine();
		String v1 = "yes";
		String v2 = "no";

			while(verification.equals(v1) == false && verification.equals(v2)== false) {
			System.out.println("Your choice wasn't found. Type yes or no");
			verification = sc.nextLine();
			}

			if(verification.equals(v1) == true) {
				for (int i = 0; i < Patient.patients.length; i++) {
					if(i == patient) {
						Patient.patients[i] = null;
						System.out.println("The process was completed successfully! The patient was cured!");
						break;
					}
				}
			}
	}
}
