package CovdTrace2;

import java.util.Scanner;

public class Patient {
	protected static Patient[] patients = new Patient[100];
	//protected static ArrayList<Contact> contacts = new ArrayList<Contact>();
	private String name;
	private String surname;
	private String dob;// date of birth//
	private String adress;
	private int id;
	private static int count;
	private String phonenum;

	public Patient(String name, String surname, String dob, String adress, String phonenum) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		this.phonenum = phonenum;
		patients[count] = this;

		count++;
		id = count;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getSurname() {
		// TODO Auto-generated method stub
		return this.surname;
	}

	public String getDob() {
		// TODO Auto-generated method stub
		return this.dob;
	}

	public String getAdress() {
		// TODO Auto-generated method stub
		return this.adress;
	}

	public String getPhonenum() {
		// TODO Auto-generated method stub
		return this.phonenum;
	}

	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
