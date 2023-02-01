package Autohaus;

public class Sonderausstattung {

	private String name;
	private int ausstattungsnummer;
	private int preis;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAusstattungsnummer() {
		return ausstattungsnummer;
	}
	public void setAusstattungsnummer(int ausstattungsnummer) {
		this.ausstattungsnummer = ausstattungsnummer;
	}
	public int getPreis() {
		return preis;
	}
	public void setPreis(int preis) {
		this.preis = preis;
	}
	
	public void printMe() {
		System.out.println("Name: "+getName()+", Ausstattungsnummer: "+getAusstattungsnummer());
	}
}
