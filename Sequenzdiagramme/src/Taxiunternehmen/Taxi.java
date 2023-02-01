package Taxiunternehmen;

public class Taxi {

	private String standort;
	
	public Taxi(String standort) {
		this.standort=standort;
	}
	
	public String standortAnfordern() {
		return this.standort;
	}
	
	public boolean auftragErteilen(String standortAuftrag) {
		return true;
	}
	
	public boolean einsteigen(String Bezirk) {
		
		return true;
	}
}
