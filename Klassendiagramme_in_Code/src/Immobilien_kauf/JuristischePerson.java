package Immobilien_kauf;

import java.util.ArrayList;

public class JuristischePerson {
	private String name;
	private String Anrede;
	private ArrayList<Immobilie> immobilien=new ArrayList<Immobilie>();
	private ArrayList<Bank> banken=new ArrayList<Bank>();
	
	public JuristischePerson(String name, String anrede) {
		this.name=name;
		this.Anrede=anrede;
	}
	public String getName() {
		return this.name;
	}
	public String getAnrede() {
		return this.Anrede;
	}
	
}
