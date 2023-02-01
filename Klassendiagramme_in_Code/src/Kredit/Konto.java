package Kredit;
import java.util.*;
public abstract class Konto {
	static Scanner x=new Scanner(System.in);
	private String inhaber;
	private String Bank;
	private double saldo;
	private int kontnummer;
	private double habenszins;
	
	public Konto(String inhaber,String bank, double saldo,int kontonummer, double habenszins) {
		this.inhaber=inhaber;
		this.Bank=bank;
		this.saldo=saldo;
		this.kontnummer=kontonummer;
		this.habenszins=habenszins;
	}
	
	public abstract void einzahlen() ;
	
	public abstract void abheben();

	public String getInhaber() {
		return inhaber;
	}

	public String getBank() {
		return Bank;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getKontnummer() {
		return kontnummer;
	}

	public double getHabenszins() {
		return habenszins;
	}
}
