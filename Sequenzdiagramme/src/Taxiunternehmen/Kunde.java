package Taxiunternehmen;

public class Kunde {

	private String standort;
	private String Bezirk;
	
	
	
	public int zahlen(int betrag) {
		return (int) (betrag+(Math.random()*10));
	}
	public static void main(String[]args) {
		int preis=0;
		Zentrale zentrale=new Zentrale();
		Kunde kunde1=new Kunde("Münchener Straße", "Olching");
		Taxi taxi=zentrale.bestellen(kunde1.getStandort(), kunde1.getBezirk());
		System.out.println(taxi);
		if(taxi.einsteigen(kunde1.getBezirk())){
			preis=kunde1.zahlen(35);
			zentrale.freiMelden(taxi, kunde1.getBezirk());
		}
	}
	
	public Kunde(String standort, String bezirk) {
		this.standort=standort;
		this.Bezirk=bezirk;
	}
	
	public String getStandort() {
		return this.standort;
	}
	public String getBezirk() {
		return this.Bezirk;
	}
}
