package pl.edu.pw.mini.po.zadanie1.demo;

import java.lang.reflect.Array;
import java.util.Random;

import pl.edu.pw.mini.po.zadanie1.KamienistaGleba;
import pl.edu.pw.mini.po.zadanie1.KomorkaTerenowa;
import pl.edu.pw.mini.po.zadanie1.NiekamienistaGleba;
import pl.edu.pw.mini.po.zadanie1.Piasek;
import pl.edu.pw.mini.po.zadanie1.PodmoklaLaka;
import pl.edu.pw.mini.po.zadanie1.TerenWodny;

public class Kontrola {

	private KomorkaTerenowa[][] tablica;
	private static final int domyslnyRozmiar = 100;
	protected static final Random random = new Random();

	public Kontrola(int x, int y) {
		if (x <= 0) {
			x = domyslnyRozmiar;
		}
		if (y <= 0) {
			y = domyslnyRozmiar;
		}

		tablica = new KomorkaTerenowa[x][y];
		wypelnijTablice();

	}

	private void wypelnijTablice() {
		KomorkaTerenowa el;
		for (int i = 0; i < Array.getLength(tablica); i++) {
			for (int j = 0; j < Array.getLength(tablica[i]); j++) {
				switch (random.nextInt(5)) {
				case 0:
					el = new Piasek();
				case 1:
					el = new KamienistaGleba();
				case 2:
					el = new NiekamienistaGleba();
				case 3:
					el = new PodmoklaLaka();
				default:
					el = new TerenWodny();
				}
				tablica[i][j] = el;
			}
		}
	}

	protected void modyfikujAtmosfere() {
		int los;
		for (int i = 0; i < Array.getLength(tablica); i++) {
			for (int j = 0; j < Array.getLength(tablica[i]); j++) {
				los = random.nextInt(4) - 1;
				tablica[i][j].modyfikujTemperature(los);
			}
		}
	}

	public KomorkaTerenowa[][] getTablica() {
		return tablica;
	}

}
