package Autohaus;

public class Fahrzeugtyp {
	private String marke;
	private String modell;
	private int baujahr;
	
	public Fahrzeugtyp(String marke,String modell,int baujahr) {
		this.baujahr=baujahr;
		this.marke=marke;
		this.modell=modell;
	}

	public String getMarke() {
		return marke;
	}

	public String getModell() {
		return modell;
	}

	public int getBaujahr() {
		return baujahr;
	}
	
	public void printMe() {
		System.out.println("Marke: "+ this.marke + ", Modell: "+ this.modell+", Baujahr: "+ this.baujahr);
	}
}
