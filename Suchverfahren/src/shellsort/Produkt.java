package shellsort;

public class Produkt {

	private int St�ckzahl;
	private double Preis;
	private int MwSt;
	private double gesamtPreis;
	private String name;
	
	public Produkt(String name,int st�ckzahl, int MwSt) {
		this.name=name;
		this.St�ckzahl=st�ckzahl;
		this.MwSt=MwSt;
		if(name.contains("1 Paar Wiener m. Br�")) this.Preis=3.5;
		this.gesamtPreis=this.Preis*this.St�ckzahl;
	}		
	
	public void printMe() {
		System.out.println(this.St�ckzahl+"x "+this.name+" "+this.Preis+" "+this.gesamtPreis+" "+this.MwSt);
	}
}
