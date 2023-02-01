package Kredit;

public class Tagesgeldkonto extends Konto {
	private int intervall;
	public Tagesgeldkonto(String inhaber, String bank, double saldo, int kontonummer, double habenszins,int intervall) {
		super(inhaber, bank, saldo, kontonummer, habenszins);
		this.intervall=intervall;
	}
	
	@Override
	public void einzahlen() {
		
		setSaldo(getSaldo()+Konto.x.nextDouble());
	}

	@Override
	public void abheben() {
		System.out.println("Was möchten sie abheben?");
		double ab=Konto.x.nextDouble();
		if(getSaldo()-ab>=0) {
			setSaldo(getSaldo()-ab);
		}
	}

	public int getIntervall() {
		return intervall;
	}

}
