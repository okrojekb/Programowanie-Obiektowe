package pl.edu.pw.mini.po.terminal.bramki;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.po.terminal.bagaze.Bagaz;
import pl.edu.pw.mini.po.terminal.bagaze.BagazPodreczny;
import pl.edu.pw.mini.po.terminal.pasazer.Pasazer;

public class OperatorBramkiBezpieczenstwa {

	private Kontrola kontrola;

	public OperatorBramkiBezpieczenstwa(Kontrola k) {
		kontrola = k;
	}

	public void sprawdzPasazera(Pasazer pasazer) {
		List<BagazPodreczny> bagaze = new ArrayList<>();
		bagaze.addAll(pasazer.getBagazePodreczne());
		for (BagazPodreczny p : bagaze) {
			try {
				System.out.println("Skanujemy twoj bagaz...");
				if (kontrola.skanujBagaz(p, pasazer)) {
					System.out.println("W tym bagazu nie bylo nic nielegalnego.");
				} else {
					bagaze.remove(p);
					System.out.println("W twoim bagazu sa nielegalne przedmioty. Zostaly one z niego usuniete.");
					pasazer.setBagazePodreczne(bagaze);
				}
			} catch (KielbasaException exc) {
				exc.printStackTrace();
			}
		}
	}

}
