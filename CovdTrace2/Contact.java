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
	private String cough;
	private String fever;
	private String tiredness;
	private String difficultybreathing;
	private static int count;

	public Contact(int patientId, String name, String surname, String adress, String phonenum, String sex,
	String numID, String amka, String afm, String mask, String cough, String fever, String tiredness, String difficultybreathing) {

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
		this.cough = cough;
		this.fever = fever;
		this.tiredness = tiredness;
		this.difficultybreathing = difficultybreathing;
		contacts[count] = this;

		count++;
	}

	@Override
	public String toString() {
	String data = " Patient's Id:" + patientId + "\n"
				  + " Name:" + name + "\n"
				  + " Surname:" + surname + "\n"
				  + " Adress:" + adress + "\n"
				  + " TelNumber:" + phonenum + "\n"
				  + " Sex:" + sex + "\n"
				  + " Number ID:" + numID + "\n"
				  + " Amka:" + amka + "\n"
				  + " Afm:" + afm + "\n"
				  + " Mask:" + mask + "\n"
				  +"-------------------- " + "Symptoms Details: " + "--------------------\n"
				  + " Cough:" + cough + "\n"
				  + " Fever:" + fever + "\n"
				  + " Tiredness:" + tiredness + "\n"
				  + " Difficultybreathing:" + difficultybreathing + "\n";
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

	public String getCough() {
		// TODO Auto-generated method stub
		return this.cough;
	}

	public String getFever() {
		// TODO Auto-generated method stub
		return this.fever;
	}

	public String getTiredness() {
		// TODO Auto-generated method stub
		return this.tiredness;
	}

	public String getDifficultybreathing() {
		// TODO Auto-generated method stub
		return this.difficultybreathing;
	}

}
