package BubbleSort;

public class Bubblesort {

	public void bubbleSort(int[]arr) {
		int temp=0;
		for(int i=0;i<(arr.length);i++) {
			for(int j=1;j<(arr.length-i);j++) {
				if(arr[j-1]>arr[j]) {
					//swap elements of array
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	
	
	public void selectionSort(int[]arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public void insertionSort(int[]arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
	}
	public void initialize(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100);
			System.out.println(arr[i]+"\n");
		}
	}
	public void printMe(int[]arr) {
		System.out.println("Jetzt sortiert: \n");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\n");
		}
	}
	public static void main(String[]args) {
		Bubblesort k=new Bubblesort();
		/*int[] arr=new int[20];
		k.initialize(arr);
		k.bubbleSort(arr);
		k.printMe(arr);
		int[] lol=new int[20];
		k.initialize(lol);
		k.selectionSort(lol);
		k.printMe(lol);*/
		
		int[] liste=new int[20];
		k.initialize(liste);
		Quicksort.Quick sort=new Quicksort.Quick();
		liste=sort.QuickTakeTwo(liste, 0, (liste.length-1));
		liste=sort.QuickTakeTwo(liste, 0, (liste.length-1));
		liste=sort.QuickTakeTwo(liste, 0, (liste.length-1));
		liste=sort.QuickTakeTwo(liste,0, (liste.length-1));
		liste=sort.QuickTakeTwo(liste, 0, (liste.length-1));
		liste=sort.QuickTakeTwo(liste, 0, (liste.length-1));
		
		k.printMe(liste);
	}
}
