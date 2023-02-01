package TestOuterPackageAccess;
import java.util.Arrays;

import BinäreSuche.BinärSuche;
public class Test1 {
	
	public static void main(String[]args) {
		int[] feld=new int[1000];
		for(int i=0;i<feld.length;i++) {
			feld[i]=(int)(Math.random()*1000);
		}
		Arrays.sort(feld);
		BinärSuche.searchBinary(feld,0,feld.length-1,42);
	}

}
