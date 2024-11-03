package pl.edu.pw.mini.po.automat.produkty;

import java.util.Random;

public abstract class ProduktSpozywczy implements Comparable<ProduktSpozywczy> {

	protected static Random random = new Random();
	protected int procentowaZawartoscCukruWMasie;

	protected int ustawIntZZakresuMinMax(int min, int max) {
		int wynik = min + random.nextInt((max - min) + 1);
		return wynik;
	}

	abstract double getSugarContent();

	@Override
	public int compareTo(ProduktSpozywczy o) {
		int wynik = this.procentowaZawartoscCukruWMasie - o.procentowaZawartoscCukruWMasie;
		return wynik;
	}

	public boolean procentowaZawartoscCukruWMasiePozaZakresem() {
		if (procentowaZawartoscCukruWMasie < 0 | procentowaZawartoscCukruWMasie >= 100) {
			return true;
		} else {
			return false;
		}
	}

}
