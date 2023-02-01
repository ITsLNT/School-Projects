package Autohändler;

public class Achse {
	private Rad radLinks,radRechts;
	public Achse() {
		radLinks=new Rad();
		radRechts=new Rad();
	}
	public Rad getRadLinks() {
		return radLinks;
	}
	public Rad getRadRechts() {
		return radRechts;
	}
}
