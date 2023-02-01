package Kredit;

public class Girokonto extends Konto {
	
	private double dispo;
	private double dispoZins;

	public Girokonto(String inhaber, String bank, double saldo, int kontonummer, double habenszins,double dispo,double dispoZins) {
		super(inhaber, bank, saldo, kontonummer, habenszins);
		this.dispo=dispo;
		this.dispoZins=dispoZins;
	}
	
	@Override
	public void einzahlen() {
		setSaldo(getSaldo()+Konto.x.nextDouble());
		
	}

	

	@Override
	public void abheben() {
		System.out.println("Was möchtest du abheben?");
		double ab=Konto.x.nextDouble();
		if(getSaldo()-ab>this.dispo*(-1)) {
			setSaldo(getSaldo()-ab);
		}
		
	}
	public double getDispo() {
		return dispo;
	}

	public double getDispoZins() {
		return dispoZins;
	}

}
