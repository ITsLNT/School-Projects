package Universität;

import java.util.Date;

public class Person {
	
	public String name;
	public String adresse;
	public Date gebdatum;
	public static int anzPersonen;
	
	public Person(String name,String adresse,Date gebdatum) {
		this.name=name;
		this.adresse=adresse;
		this.gebdatum=gebdatum;
	}
	public void druckeAdresse() {
		
	}
}
