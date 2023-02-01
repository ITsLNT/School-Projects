package Universität;

import java.util.Date;

public class Hilfskraft extends Student {

	public String[] beschaeftigungen;
	public Hilfskraft(String name, String adresse, Date gebdatum, int matrikelnummer, boolean immatrikulation, String[] beschaeftigungen) {
		super(name, adresse, gebdatum, matrikelnummer, immatrikulation);
		
		this.beschaeftigungen=beschaeftigungen;
	}

	public void druckeArbeitszeit() {
		
	}
}
