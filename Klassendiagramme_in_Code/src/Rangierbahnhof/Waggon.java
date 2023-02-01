package Rangierbahnhof;

public class Waggon {

	private int Start;
	private int Ziel;
	public Waggon(int start, int ziel) {
		super();
		this.Start = start;
		this.Ziel = ziel;
	}
	
	public int getStart() {
		return this.Start;
	}
	public int getZiel() {
		return this.Ziel;
	}
	
}
