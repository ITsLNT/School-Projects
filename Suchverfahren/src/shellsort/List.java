package shellsort;

import java.util.ArrayList;
import java.util.Arrays;

public class List {

	public static void main(String[]args) {
		ArrayList<String> favoriteSubjets=new ArrayList<String>();
		favoriteSubjets.add("TeIn");
		favoriteSubjets.add("Physik");
		
		favoriteSubjets.add("English");
		for( String c: favoriteSubjets) {
			System.out.println(c);
		}
		ArrayList<Integer> lottozahlen=new ArrayList<Integer>();
		
		java.util.List<Integer> anotherlist= Arrays.asList(1,17,20,25,30,31,33);
		lottozahlen.addAll(anotherlist);
		for(Integer c:lottozahlen) {
			System.out.println(c);
		}
		
		ArrayList<String> Racer=new ArrayList<String>();
		java.util.List<String> x= Arrays.asList("Hamilton","Vettel","Bottas","Leclerc","Verstappen");
		Racer.addAll(x);
		System.out.println("Größe der liste: "+Racer.size());
		Racer.remove("Vettel");
		if(Racer.contains("Hamilton")) {
			System.out.println("Hamilton ist enthalten.");
		}
		System.out.println(Racer.get(0));
		Racer.add(2,"Vettel");
		Racer.set(Racer.size()-1, "Schumacher");
		for(String c: Racer) {
			if()
		}
		
	}
}
