package shellsort;

public class Produkt {

	private int Stückzahl;
	private double Preis;
	private int MwSt;
	private double gesamtPreis;
	private String name;
	
	public Produkt(String name,int stückzahl, int MwSt) {
		this.name=name;
		this.Stückzahl=stückzahl;
		this.MwSt=MwSt;
		if(name.contains("1 Paar Wiener m. Brö")) this.Preis=3.5;
		this.gesamtPreis=this.Preis*this.Stückzahl;
	}		
	
	public void printMe() {
		System.out.println(this.Stückzahl+"x "+this.name+" "+this.Preis+" "+this.gesamtPreis+" "+this.MwSt);
	}
}
