package Autohaus;

import java.util.ArrayList;

public class Fahreug {
	private Fahrzeugtyp e;
	private Farbe f;
	private Motortyp m;
	private ArrayList<Sonderausstattung> s;
	public Fahreug(Fahrzeugtyp e, Farbe f, Motortyp m, ArrayList<Sonderausstattung> s) {
		this.setE(e);
		this.f=f;
		this.m=m;
		this.s=s;
		this.printAll();
	}
	
	public Farbe getF() {
		return f;
	}

	public void setF(Farbe f) {
		this.f = f;
	}

	public Motortyp getM() {
		return m;
	}

	public void setM(Motortyp m) {
		this.m = m;
	}

	public ArrayList<Sonderausstattung> getS() {
		return s;
	}

	public void setS(ArrayList<Sonderausstattung> s) {
		this.s = s;
	}

	public void printAll() {
		getE().printMe();
		f.printMe();
		m.printMe();
		for(int i=0; i<s.size();i++)
		while(s.get(i)!=null) {
			s.get(i).printMe();
		};
	}

	public Fahrzeugtyp getE() {
		return e;
	}

	public void setE(Fahrzeugtyp e) {
		this.e = e;
	}
}
