package CovdTrace2;

import java.util.Scanner;

public class Patient {
	protected static Patient[] patients = new Patient[100];
	private String name;
	private String surname;
	private String dob;// date of birth//
	private String adress;
	private int id;
	private String phonenum;
	private String sex;
	private String numID;
	private String amka;
	private String afm;
	private String mask;
	private static int count;

	public Patient(String name, String surname, String dob, String adress, String phonenum, String sex, String numID, String amka, String afm, String mask) {

		this.name = name;
		this.surname = surname;
		this.dob = dob;
		this.adress = adress;
		this.phonenum = phonenum;
		this.sex = sex;
		this.numID = numID;
		this.amka = amka;
		this.afm = afm;
		this.mask = mask;
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

	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
