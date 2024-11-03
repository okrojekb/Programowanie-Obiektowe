package pl.edu.pw.mini.po.lab06;

public class Gleba extends ObiektZiemny {

	protected double gestosc;
	protected static double minGestosc = 1.4;
	protected static double maxGestosc = 2.4;

	public Gleba(int wO) {
		super(wO);
		gestosc = wylosuj(minGestosc, maxGestosc);
	}
	
	public String toString() {
		String str = super.toString() + " i gestosc: " + gestosc;
		return str;
	}

}
