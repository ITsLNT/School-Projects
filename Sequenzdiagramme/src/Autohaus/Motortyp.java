package Autohaus;

public class Motortyp {

	private int motorennummer;
	private String motorenart;
	private int Leistung;
	private int Preis;
	
	public Motortyp(Fahrzeugtyp e) {
		
	}
	public Motortyp(int motorennummer, String motorenart, int Leistung,int preis) {
		this.Leistung=Leistung;
		this.motorenart=motorenart;
		this.motorennummer=motorennummer;
		this.Preis=preis;
	}
	
	public void printMe() {
		System.out.println("Nummer: "+this.motorennummer+", Art: "+this.motorenart+", Leistung: "+this.Leistung);
	}
	public int getPreis() {
		return Preis;
	}
}
