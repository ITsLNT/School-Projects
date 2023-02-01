package Autohändler;

public class Fahrzeughalter {
	private String name;
	private PKW Neuwagen;
	
	public Fahrzeughalter(String name) {
		this.name=name;		
	}

	public String getName() {
		return name;
	}

	public PKW getNeuwagen() {
		return Neuwagen;
	}
	public void autokauf() {
		this.Neuwagen=new PKW();
	}
}
