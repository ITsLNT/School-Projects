package Autohändler;

public class Motor extends Einzelteile {
	private Zylinder zylinderONE,zylinderTWO,zylinderTHREE,zylinderFOUR,zylinderFIVE,zylinderSIX;
	private Kolben kolben;
	public Motor (String bezeichnung, byte zylinder) {
		super(bezeichnung);
		kolben=new Kolben();
	if(zylinder>=4) {
		zylinderONE=new Zylinder();
		zylinderTWO=new Zylinder();
		zylinderTHREE=new Zylinder();
		zylinderFOUR=new Zylinder();
		if (zylinder>=5) {
			zylinderFIVE=new Zylinder();
			if(zylinder==6)zylinderSIX=new Zylinder();
		}}
	}
	public Kolben getKolben() {
		return kolben;
	}
	public Zylinder getZylinderONE() {
		return zylinderONE;
	}
	public Zylinder getZylinderTWO() {
		return zylinderTWO;
	}
	public Zylinder getZylinderTHREE() {
		return zylinderTHREE;
	}
	public Zylinder getZylinderFOUR() {
		return zylinderFOUR;
	}
	public Zylinder getZylinderFIVE() {
		return zylinderFIVE;
	}
	public Zylinder getZylinderSIX() {
		return zylinderSIX;
	}

	
	
}
