package Autohändler;

import java.util.Scanner;

public abstract class Einzelteile {
	static Scanner x=new Scanner(System.in);
	private String bezeichnung;
	public Einzelteile(String bezeichnung) {
		this.bezeichnung=bezeichnung;
			
		
	}
	public String getBezeichnung() {
		return bezeichnung;
	}
}
