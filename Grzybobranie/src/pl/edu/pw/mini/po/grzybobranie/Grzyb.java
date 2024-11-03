package pl.edu.pw.mini.po.grzybobranie;

import java.util.Random;

public abstract class Grzyb {
	private static Random random = new Random();
	protected int masaOwocnika;
	protected Twardosc twardosc;

	public Grzyb(int minm, int maxm) {
		masaOwocnika = wylosuj(minm, maxm);
	}

	private int wylosuj(int minm, int maxm) {
		int mO = random.nextInt(minm, maxm + 1);
		return mO;
	}

	protected Twardosc ustawTwardosc() {
		Twardosc opcje[] = Twardosc.values();
		Twardosc tw = opcje[random.nextInt(opcje.length)];
		return tw;
	}

	public String getInfo() {
		String str = "Masa Owocnika to: " + masaOwocnika;
		return str;
	}

	protected void ugotuj() {
		twardosc = Twardosc.MIĘKKI;
	}

	protected boolean isTrujacy() {
		return false;
	}

}
