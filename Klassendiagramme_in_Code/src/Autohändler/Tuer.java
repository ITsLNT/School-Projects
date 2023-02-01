package Autohändler;

public class Tuer extends Einzelteile {
	private String farbe;
	private boolean isSchiebe=false;
	private boolean isFluegel=false;
	public Tuer(String bezeichnung) {
		super(bezeichnung);
		System.out.println("Welche Farbe hat die Tür?");
		this.farbe=x.next();
		System.out.println("Ist es eine Schiebe oder Fluegeltuer oder eine normale?");
		String b=x.next();
		if(b.contains("Fluegeltuer")) {
			this.isFluegel=true;
		}
		else if(b.contains("Schiebetuer")) {
			this.isSchiebe=true;
		}
		else {
			if(isSchiebe==true) {
				isSchiebe=false;
			}
			if(isFluegel==true)isFluegel=false;
		}
	}
	public String getFarbe() {
		return farbe;
	}
	
}
