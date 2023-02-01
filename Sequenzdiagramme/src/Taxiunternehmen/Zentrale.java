package Taxiunternehmen;

public class Zentrale {

	private Taxi taxi1 = new Taxi("Stadtrand");
	private Taxi taxi2 = new Taxi("Stadtmitte");

	public Taxi bestellen(String Standort, String Bezirk) {
		char[] s = Standort.toCharArray();
		char[] c = taxi1.standortAnfordern().toCharArray();
		int standortKunde = 0;
		int standortTaxi = 0;
		for (int i = 0; i < s.length; i++) {
			standortKunde = standortKunde + s[i];
		}
		for (int i = 0; i < c.length; i++) {
			standortTaxi = standortTaxi + c[i];
		}
		System.out.println(taxi1);
		System.out.println(taxi2);
		if (standortKunde >= standortTaxi) {
			if (taxi1.auftragErteilen(Standort)) {

				return taxi1;
			}
		} else {
			if (taxi2.auftragErteilen(Standort)) {

				return taxi2;
			}

		}
		return taxi1;
	}

	public boolean freiMelden(Taxi taxi, String Bezirk) {
		return true;
	}
}
