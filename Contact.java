package CovdTrace2;

import java.util.Scanner;

public class Contact {

	protected static Contact[] contacts = new Contact[1000];
	private int patientId;
	private String name;
	private String surname;
	private String adress;
	private String phonenum;
	private String sex;
	private String numID;
	private String amka;
	private String afm;
	private String mask;
	private static int count;

	public Contact(int patientId, String name, String surname, String adress, String phonenum, String sex, String numID, String amka, String afm, String mask) {

		this.patientId = patientId;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.phonenum = phonenum;
		this.sex = sex;
		this.numID = numID;
		this.amka = amka;
		this.afm = afm;
		this.mask = mask;
		contacts[count] = this;

		count++;
	}

	@Override
	public String toString() {
	String data = "Patient's Id: " + patientId
				  + " Name: " + name
				  + " Surname: " + surname
				  + " Adress:" + adress
				  + " TelNumber:" + phonenum
				  + " Sex:" + sex
				  + " Number ID:" + numID
				  + " Amka:" + amka
				  + " Afm:" + afm
				  + " Mask:" + mask;
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

	public String getPhonenum() {
		// TODO Auto-generated method stub
		return this.phonenum;
	}

	public String getSex() {
		// TODO Auto-generated method stub
		return this.sex;
	}

	public String getNumID() {
		// TODO Auto-generated method stub
		return this.numID;
	}

	public String getAmka() {
		// TODO Auto-generated method stub
		return this.amka;
	}

	public String getAfm() {
		// TODO Auto-generated method stub
		return this.afm;
	}

	public String getMask() {
		// TODO Auto-generated method stub
		return this.mask;
	}

}
