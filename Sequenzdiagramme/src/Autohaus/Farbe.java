package Autohaus;

public class Farbe {

	private String Farbton;
	private boolean Metallic;
	private int preis=0;
	
	public Farbe(String farbton,boolean metallic) {
		this.Farbton=farbton;
		this.Metallic=metallic;
		
		if(this.Farbton.contentEquals("Rot")) {
			this.preis=+80;
			if(this.Metallic==true) {
				this.preis=this.preis+150;
			}
		}
	}
	
	public void printMe() {
		System.out.println("Farbton: "+this.Farbton+", Metallic: "+this.Metallic);
	}

	public int getPreis() {
		return preis;
	}
	
	/*public boolean erlaubteFahrzeugtypen(Fahrzeugtyp e) {
		return false;
		
	}*/
}
