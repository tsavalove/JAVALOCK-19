package CovidTrace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Patient {

	public String name;
	public String surname;
	public String dob;// date of birth//
	public String adress;
	private final int id;
	public int phonenum;




	public Patient(String name, String surname, String dob, String adress, int phonenum2,
			) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		this.phonenum = phonenum2;

	}

	public int getId() {
		return id;
	}
}
