package BinäreSuche;

import java.util.Arrays;

public class BinärSuche {

	public static void searchBinary(int[] feld, int anfang,int ende, int wert) {
		
		int grenze=anfang+((ende-anfang)/2);	
		
		if(feld.length==0) {
			System.out.println("Array ist leer");
			return;
		}
		if(grenze>=feld.length) {
			System.out.println(wert+" ist nicht im Array");
			return;
		}
		if(wert>feld[grenze]) {
			System.out.println(anfang+" "+ende+" "+grenze);
			searchBinary(feld, grenze+1,ende,wert);// schauen nun auf die rechte hälfte
		}else if(wert<feld[grenze]&&anfang!=grenze) {
			System.out.println(anfang+" "+ende+" "+grenze);
			searchBinary(feld,anfang,grenze-1,wert);//schauen nun auf die linke Hälfte
		}else if(wert==feld[grenze]) {
			System.out.println(wert+" an position "+grenze+" enthalten");
		}else {
			System.out.println(wert+" ist nicht im Array");
		}
		
		
	}
	public static void main(String[]args) {
			int[] feld= new int[1000];
			for(int i=0;i<feld.length;i++) {
				feld[i]=(int)(Math.random()*1000);
			}
			Arrays.sort(feld);
			searchBinary(feld,0,feld.length-1,42);
	}
}
