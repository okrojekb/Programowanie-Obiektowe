package pl.edu.pw.mini.po.Pralnia.ubrania;

import java.util.LinkedHashSet;
import java.util.Set;

import pl.edu.pw.mini.po.Pralnia.kieszen.Guzik;

public class Koszula extends ElementGarderobyZRozmiarem {

	private Set<Guzik> guziki = new LinkedHashSet<Guzik>(6);

	public Koszula() {
		super();
		for (int i = 0; i < 6; i++) {
			guziki.add(new Guzik());
		}
	}

}
