package Autohändler;

public class Aufhaengung extends Einzelteile {
	private byte achsen;
	private Achse achseONE,achseTWO,achseTHREE,achseFOUR;
	public Aufhaengung(String bezeichnung,byte achsen) {
		super(bezeichnung);
		this.achsen=achsen;
		if(achsen>=2) {
			achseONE=new Achse();
			achseTWO=new Achse();
			if(achsen>=3) {
				achseTHREE=new Achse();
				if(achsen==4)achseFOUR=new Achse();
			}
		}
			
	}
	public Achse getAchseONE() {
		return achseONE;
	}
	public Achse getAchseTWO() {
		return achseTWO;
	}
	public Achse getAchseTHREE() {
		return achseTHREE;
	}
	public Achse getAchseFOUR() {
		return achseFOUR;
	}
	public byte getAchsen() {
		return achsen;
	}

}
