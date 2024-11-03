package pl.edu.pw.mini.po.terminal.bagaze;

import java.util.HashSet;
import java.util.Set;

import pl.edu.pw.mini.po.terminal.przedmioty.PrzedmiotLegalny;

public class BagazGlowny extends Bagaz {
	
	private Set<PrzedmiotLegalny> przedmioty = new HashSet<>();

	public BagazGlowny() {
		super();
		int iloscPrzedmiotow = 2 +random.nextInt(9);
		for(int i =0; i<iloscPrzedmiotow; i++) {
			przedmioty.add(new PrzedmiotLegalny());
		}
	}

}
