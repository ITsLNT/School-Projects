package Autohaus;

import java.util.ArrayList;

public class Angebot {

	private int angebotsnummer;
	private String kundenname;
	private double gesamtpreis;
	ArrayList<Sonderausstattung> s;
	Fahreug f1=new Fahreug(new Fahrzeugtyp("OPI", "Frosch",2016),new Farbe("Rot",true),new Motortyp(20030305,"Benzin",70,1300),s);
	
	public Angebot(String kundenname, int rabattstufe,double zulassungskosten) {
		this.kundenname=kundenname;
	}
	
	public double berrechneGesamtpreis(int rabattsufe,double zulassungskosten) {
		double sum=f1.getF().getPreis()+f1.getM().getPreis();
		for(int i=0;i<f1.getS().size();i++)
		if(!(f1.getS().isEmpty()))sum=sum+f1.getS().get(i).getPreis();
		return sum;
	}

	public int getAngebotsnummer() {
		return angebotsnummer;
	}

	public void setAngebotsnummer(int angebotsnummer) {
		this.angebotsnummer = angebotsnummer;
	}
}
