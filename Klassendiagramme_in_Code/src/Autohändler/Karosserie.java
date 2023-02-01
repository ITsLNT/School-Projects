package Autohändler;

public class Karosserie extends Einzelteile {
	private String Farbe;
	private String Marke;
	public Karosserie(String bezeichnung) {
		super(bezeichnung);
		System.out.println("Welche Farbe hat die Karosserie?");
		Farbe=x.next();
		System.out.println("Welche Marke gehört das Auto an?");
		Marke=x.next();
	}
	public String getMarke() {
		return Marke;
	}
	public String getFarbe() {
		return Farbe;
	}
}
