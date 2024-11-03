package pl.edu.pw.mini.po.grzybobranie;

import java.lang.reflect.Array;
import java.util.Random;

public class Las implements GetGrzyb{
	public Grzyb[][] tablica;
	private static Random random = new Random();

	public Las(int x, int y) {
		if (x <= 0) {
			x = 100;
		}
		if (y <= 0) {
			y = 100;
		}
		tablica = new Grzyb[x][y];
		wypelnijTablice();
	}

	private void wypelnijTablice() {
		int nrKolumnyBezGrzybow = random.nextInt(Array.getLength(tablica));
		for (int i = 0; i < Array.getLength(tablica); i++) {
			for (int j = 0; j < Array.getLength(tablica[i]); j++) {
				if (j == nrKolumnyBezGrzybow) {
					continue;
				} else {
					double losowa = random.nextDouble();
					if (losowa < 0.2) {
						tablica[i][j] = wylosujGrzyba();
					}
				}
			}
		}
	}

	private Grzyb wylosujGrzyba() {
		Grzyb grzyb;
		switch (random.nextInt(3)) {
		case 0:
			grzyb = new MuchomorCesarski();
			break;
		case 1:
			grzyb = new MuchomorKolczastoglowy();
			break;
		case 2:
			grzyb = new MuchomorSromotnikowy();
			break;
		case 3:
			grzyb = new MuchomorSzarawy();
			break;
		default:
			grzyb = new MuchomorCesarski();
		}
		return grzyb;
	}
	
	public Grzyb zwrocGrzyba() {
		int i = random.nextInt(Array.getLength(tablica));
		int j = random.nextInt(Array.getLength(tablica[0]));
		Grzyb grzyb = tablica[i][j];
		tablica[i][j] = null;
		return grzyb;
		

	}
}
