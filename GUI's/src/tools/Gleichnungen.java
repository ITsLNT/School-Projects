package tools;

import javax.swing.JLabel;

public class Gleichnungen {

	public int subtrahieren(JLabel s) {
		String all = s.getText();
		String[] c = all.split(" ");
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum = sum + (Integer.valueOf(c[i]) - Integer.valueOf(c[i++]));
		}
		return sum;
	}

	public int addieren(JLabel s) {
		String all = s.getText();
		String[] c = all.split(" ");
		int sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum = sum + Integer.valueOf(c[i]);
		}
		return sum;
	}

	public double multipliezieren(JLabel s) {
		String all = s.getText();
		String[] c = all.split(" ");
		double sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum = sum + (Integer.valueOf(c[i]) * Integer.valueOf(c[i++]));
		}
		return sum;
	}

	public double dividieren(JLabel s) {
		String all = s.getText();
		String[] c = all.split(" ");
		double sum = 0;
		for (int i = 0; i < c.length; i++) {
			sum = sum + (Integer.valueOf(c[i]) / Integer.valueOf(c[i++]));
		}
		return sum;
	}
	
	public void quadratischeGleichungIstGleichNull(JLabel s) {
		String all = s.getText();
		String[] z = all.split(" ");
		String[] j=z[z.length-1].split("=");
		
		double x1=0;
		double x2=0;
		double b=Integer.valueOf(z[1]);
		double c=Integer.valueOf(j[0]);
		x1=-1/2*b+(Math.sqrt((Math.pow(b/2, 2))+c));
		x2=1/2*b+(Math.sqrt((Math.pow(b/2, 2))+c));
		System.out.println("X1 ist: " + x1 + "\nX2 ist: " + x2);
	}
}
