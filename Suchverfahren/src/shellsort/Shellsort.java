package shellsort;

public class Shellsort {
	static int m;
	static int[][] c;

	public static void sort(int[] liste) {

		int inner, outer;
		int tmp;
		int h = 1;
		while (h <= liste.length / 4) {

			h = h * 4 + 1;

		}

		while (h > 0) {

			for (outer = h; outer < liste.length; outer++) {

				tmp = liste[outer];

				inner = outer;

				while (inner > h - 1 && liste[inner - h] >= tmp) {

					liste[inner] = liste[inner - h];
					inner -= h;

				}
				liste[inner] = tmp;

			}
			h = (h - 1) / 4;

		}

	}

	public static void ownShel(int[] liste) {
		m = liste.length / 4;
		c = new int[4][m];
		int t = 0;
		for (int w = 0; w < 4; w++) {
			for (int i = 0; i < m; i++) {
				c[w][i] = liste[t];
				t++;
			}
		}
		System.out.println("Eingabe von Shel:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++)
				System.out.print(c[i][j] + " ");
			System.out.println();
		}
		int temp;
		for (int i = 0; i < m; i++) {
			for (int w = 0; w < 4; w++) {
					temp = c[w][i];
					int j=w;
					while (j > 0 && c[j - 1][i] > temp) {
						c[j][i] = c[j - 1][i];
						j--;
					}
					c[j][i] = temp;
			}
		}
		
		
		
		t=0;
		System.out.println("Sortiert mit Shel:");
		 for(int i = 0; i< c.length; i++) {
	            for (int j = 0; j < c[i].length; j++) {
	            	liste[t]=c[i][j];
	            	t++;
	            }
	     }
		for(int i=0;i<liste.length;i++) {
			System.out.println(liste[i]);
		}
		
	}
	
	

	public static void main(String[] args) {

		int[] liste = { 4, 10, 2, 8, 1, 7, 12, 3, 6, 11, 5, 9 };
		/*System.out.print("Eingabe Liste: ");
		for (int i = 0; i < liste.length; i++)
			System.out.println(liste[i]);
		sort(liste);
		System.out.print("Sortierte Liste: ");
		for (int i = 0; i < liste.length; i++)
			System.out.println(liste[i]);*/

		ownShel(liste);
		ownShel(liste);

	}

}
