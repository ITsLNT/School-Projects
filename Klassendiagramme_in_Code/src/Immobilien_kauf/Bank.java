package Immobilien_kauf;

import java.util.ArrayList;

public class Bank {

	private String name;
	private ArrayList<JuristischePerson> banken=new ArrayList<JuristischePerson>();
	private ArrayList<Darlehen> Darlehen=new ArrayList<Darlehen>();
	public Bank(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

}
