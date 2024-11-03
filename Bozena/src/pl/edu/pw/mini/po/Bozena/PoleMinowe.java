package pl.edu.pw.mini.po.Bozena;

import java.util.Random;

public class PoleMinowe {

	public ElementPodloza[][] tablica;
	private static final int rozmiarPola = 100;
	private final static Random random = new Random();

	public PoleMinowe() {
		tablica = new ElementPodloza[rozmiarPola][rozmiarPola];
		ustawTablice();
	}

	private void ustawTablice() {
		for (int i = 0; i < rozmiarPola; i++) {
			for (int j = 0; j < rozmiarPola; j++) {
				double los = random.nextDouble();
				if (los <= 0.4) {
					tablica[i][j] = stworzElement();
				} else {
					tablica[i][j] = null;
				}
			}
		}

	}

	private ElementPodloza stworzElement() {
		ElementPodloza el;
		int los = random.nextInt(4);
		switch (los) {
		case 0:
			el = new Trawa();
			break;
		case 1:
			el = new Purchawka();
			break;
		case 2: {
			PrzeciwpiechotnaMina pp = new PrzeciwpiechotnaMina();
			if (random.nextInt(10) != 0) {
				pp.armMe();
			}
			el = pp;
			break;
		}
		default: {
			PrzeciwczolgowaMina pc = new PrzeciwczolgowaMina();
			if (random.nextInt(10) != 0) {
				pc.armMe();
			}
			el = pc;
			break;
		}
		}
		return el;
	}

}
