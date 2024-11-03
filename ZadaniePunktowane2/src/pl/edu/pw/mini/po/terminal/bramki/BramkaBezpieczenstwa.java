package pl.edu.pw.mini.po.terminal.bramki;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.edu.pw.mini.po.terminal.bagaze.Bagaz;
import pl.edu.pw.mini.po.terminal.pasazer.Pasazer;
import pl.edu.pw.mini.po.terminal.przedmioty.Kielbasa;
import pl.edu.pw.mini.po.terminal.przedmioty.Przedmiot;
import pl.edu.pw.mini.po.terminal.przedmioty.PrzedmiotLegalny;
import pl.edu.pw.mini.po.terminal.przedmioty.PrzedmiotNielegalny;

public class BramkaBezpieczenstwa extends Bramka implements Kontrola {

	private Map<Pasazer, List<PrzedmiotNielegalny>> nielegalne = new HashMap<>();

	@Override
	public boolean skanujBagaz(Bagaz bagaz, Pasazer pas) throws KielbasaException {
		Set<PrzedmiotLegalny> przedmioty = new HashSet<>();
		przedmioty.addAll(bagaz.getPrzedmioty());
		for (Przedmiot p : przedmioty) {
			if (p.getStopienNielegalnosci() > 0) {
				if (p instanceof Kielbasa) {
					throw new KielbasaException();
				} else {
					PrzedmiotNielegalny pN = (PrzedmiotNielegalny) p;
					if (nielegalne.containsKey(pas)) {
						List<PrzedmiotNielegalny> juzZabrane = new ArrayList<>();
						juzZabrane.addAll(nielegalne.get(pas));
						juzZabrane.add(pN);

						nielegalne.replace(pas, juzZabrane);
					} else {
						List<PrzedmiotNielegalny> zabrany = new ArrayList<>();
						zabrany.add(pN);
						nielegalne.put(pas, zabrany);
					}

				}
				return false;
			}
		}
		return true;
	}

}
