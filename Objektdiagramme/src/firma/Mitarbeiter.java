package firma;

public class Mitarbeiter {
	private String name;
	private String Rang;
	private String Abteilung;
	private boolean vorgestzter;
	public Mitarbeiter(String name,String rang,String abteilung) {
		this.name=name;
		this.Rang=rang;
		this.Abteilung=abteilung;
		if(Rang.contains("untergebener")) {
			this.vorgestzter=false;
		}
	}

	public String getName() {
		return name;
	}

	public String getRang() {
		return Rang;
	}

	public String getAbteilung() {
		return Abteilung;
	}
}
