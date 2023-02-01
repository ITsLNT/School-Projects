package BinäreSuche;

public class Student {

	private String name;
	private String vorname;
	private int matrikelnummer;
	private String Studiengang;
	private int alter;
	
	public Student(String name, String vorname, int matrikelnummer,String Studiengang, int alter) {
		this.name=name;
		this.vorname=vorname;
		this.matrikelnummer=matrikelnummer;
		this.Studiengang=Studiengang;
		this.alter=alter;
	}
	public Student(String name, String vorname, String Studiengang, int alter) {
		this.name=name;
		this.vorname=vorname;
		this.matrikelnummer=(int)(Math.random()*10000+1);
		this.Studiengang=Studiengang;
		this.alter=alter;
	}
	
	public void printMe() {
		System.out.println("Name, Vorname: "+getName()+", "+getVorname()+"\nMatrikelnummer: "+getMatrikelnummer()+"\nStudiengang: "+getStudiengang()+"\nAlter: "+getAlter());
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return this.vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getMatrikelnummer() {
		return this.matrikelnummer;
	}
	public void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	public String getStudiengang() {
		return this.Studiengang;
	}
	public void setStudiengang(String studiengang) {
		Studiengang = studiengang;
	}
	public int getAlter() {
		return this.alter;
	}
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	
}
