package Universität;

import java.util.Date;

public class Student extends Person {

	public int matrikelnummer;
	public boolean immatrikulation;
	public Student(String name, String adresse, Date gebdatum,int matrikelnummer,boolean immatrikulation) {
		super(name, adresse, gebdatum);
		// TODO Auto-generated constructor stub
		this.matrikelnummer=matrikelnummer;
		this.immatrikulation=immatrikulation;
	}
	
	public void druckeAusweis() {
		System.out.println(this.name+this.gebdatum+"n\""+this.adresse+"n\""+this.matrikelnummer);
	}

}
