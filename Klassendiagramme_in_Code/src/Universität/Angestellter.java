package Universität;

import java.util.Date;

public class Angestellter extends Person {

	public int personalnr;
	public String bank;
	public double gehalt;
	
	public Angestellter(String name,String adresse,Date gebdate, String bank,int personalnr, double gehalt) {
		super(name,adresse,gebdate);
		this.bank=bank;
		this.personalnr=personalnr;
		this.gehalt=gehalt;
	}
	
	public void ueberweiseGehalt() {
		
	}
}
