package CovdTrace2;

import java.util.Scanner;

public class Contact {

	protected static Contact[] contacts = new Contact[1000];
	private int patientId;
	private String name;
	private String surname;
	private String adress;
	private int phonenum;
	private static int count;

	public Contact(int patientId, String name, String surname, String adress, int phonenum) {

		this.patientId = patientId;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.phonenum = phonenum;
		contacts[count] = this;

		count++;
	}

	@Override
	public String toString() {
	String data = "Patient Id: " + patientId
				  + " Name: " + name
				  + " Surname: " + surname
				  + " Adress:" + adress
				  + " TelNumber:" + phonenum;
	return data;

	}

	public int getPatientId() {
		// TODO Auto-generated method stub
		return this.patientId;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public String getSurname() {
		// TODO Auto-generated method stub
		return this.surname;
	}

	public String getAdress() {
		// TODO Auto-generated method stub
		return this.adress;
	}

	public int getPhonenum() {
		// TODO Auto-generated method stub
		return this.phonenum;
	}

}
