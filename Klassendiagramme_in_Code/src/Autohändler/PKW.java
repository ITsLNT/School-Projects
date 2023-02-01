package Autohändler;

public class PKW {
	private Einzelteile[] dieEinzelteile;
	final int ANZAHL = 100;

	public PKW() {
		dieEinzelteile = new Einzelteile[ANZAHL];
		for (int i = 0; i < ANZAHL; i++) {
			System.out.println("Welchen Typ hat das Teil?");
			String typ = Einzelteile.x.next();
			if (typ.equals("Motor")) {
				System.out.println("Wie viele Zylinder hat der Motor(4-6)");
				dieEinzelteile[i] = new Motor("Motor",Einzelteile.x.nextByte());
			}
			if(typ.equals("Karosserie"))dieEinzelteile[i]=new Karosserie("Karosserie");
			if(typ.equals("Tuer"))dieEinzelteile[i]=new Tuer("Tür");
			if(typ.equals("Aufhaengung")) {
				System.out.println("Wie viele Achsen hat die Aufhängung?");
				byte achsen=Einzelteile.x.nextByte();				
				dieEinzelteile[i]=new Aufhaengung("Aufhängung",achsen);
			}
		}
	}
}
