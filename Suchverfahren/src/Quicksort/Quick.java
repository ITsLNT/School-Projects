package Quicksort;

public class Quick {

	public int[] quickSort(int[]liste,int untereGrenze,int obereGrenze) {
		int links=untereGrenze;
		int rechts=obereGrenze;
		int pivot = liste[((untereGrenze+obereGrenze)/2)];
		
		while(liste[links]<pivot)links++;
		while(pivot<liste[rechts])rechts--;
		
		if(links<=rechts) {
			int temp=liste[links];
			liste[links]=liste[rechts];
			liste[rechts]=temp;
			links++;
			rechts--;
		}
		if(links<=rechts) {;
		links++;
		rechts--;
		if(untereGrenze<rechts)quickSort(liste,untereGrenze,rechts);
		if(links<obereGrenze)quickSort(liste,links,obereGrenze);}
		return liste;
	}
	
	public int[]QuickTakeTwo(int[]liste,int untereGrenze,int obereGrenze){
		int links=untereGrenze;
		int rechts=obereGrenze;
		int pivot=liste[((untereGrenze+obereGrenze)/2)];
		
		do {
			while(liste[links]<pivot) {
				links++;
			}while(pivot<liste[rechts]) {
				rechts--;
			}
			if(links<=rechts) {
				int temp=liste[links];
				liste[links]=liste[rechts];
				liste[rechts]=temp;
				links++;
				rechts--;
			}
		}while(links<=rechts);
		
		if(untereGrenze<rechts)quickSort(liste,untereGrenze,rechts);
		if(links<obereGrenze)quickSort(liste,links,obereGrenze);
		else return liste;
		return liste;
	}
	
	
}
