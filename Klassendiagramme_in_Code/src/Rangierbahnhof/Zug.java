package Rangierbahnhof;

public class Zug {

	private int Anzahl;
	private int MaxZahl=12;
	private Waggon[] Waggons=new Waggon[MaxZahl];
	
	public Zug() {
		for(int i = 0; i<MaxZahl;i++) {
			Waggons[i]=null;
		}
		Anzahl=0;
	}
	
	public Zug(int Start) {
		Waggons[0]=new Waggon(Start,4) ;
	}
}
