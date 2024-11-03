package pl.edu.pw.mini.po.zadanie1.demo;

import java.lang.reflect.Array;
import java.util.Random;

import pl.edu.pw.mini.po.zadanie1.KomorkaTerenowa;

public class Szybowiec {

	protected static final Random random = new Random();

	protected KomorkaTerenowa[][] tablica;
	protected int obecnyNumerKolumny;
	protected int obecnyNumerWiersza;
	protected int obecnaWysokosc;

	protected static int maxNumerKolumny;
	protected static int maxNumerWiersza;

	public Szybowiec(KomorkaTerenowa[][] t, int w, int wys) {
		tablica = t;
		maxNumerKolumny = Array.getLength(tablica[0]) - 1;
		maxNumerKolumny = Array.getLength(tablica) - 1;
		obecnyNumerWiersza = w;
		obecnaWysokosc = wys;
	}

	protected void fly() {
		if (obecnaWysokosc != 0) {
			if (obecnyNumerKolumny == maxNumerKolumny + 1) {
				System.out.println("Lot poza strefą");
			} else {
				obecnyNumerKolumny++;

			}
			int los = random.nextInt(3) - 1;
			obecnyNumerWiersza += los;

			if (obecnyNumerWiersza == maxNumerWiersza) {
				System.out.println("Lot poza strefą");
				obecnyNumerWiersza = maxNumerWiersza - 1;
			}

			obecnaWysokosc += tablica[obecnyNumerWiersza][obecnyNumerKolumny].getPradyNoszace();
			if (obecnaWysokosc < 0) {
				obecnaWysokosc = 0;
			}
			if (obecnaWysokosc == 0) {
				System.out.println("Ooops, lądowanie w polu!");
			}

		}else {
			System.out.println("Ooops, lądowanie w polu!");

		}
	}
	
	public String getInfo() {
		String str = ", wysokosc: " +obecnaWysokosc;
		return str;
	}

}
