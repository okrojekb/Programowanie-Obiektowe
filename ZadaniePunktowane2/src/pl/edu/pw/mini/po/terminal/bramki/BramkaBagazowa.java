package pl.edu.pw.mini.po.terminal.bramki;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import pl.edu.pw.mini.po.terminal.bagaze.Bagaz;
import pl.edu.pw.mini.po.terminal.pasazer.Bilet;

public class BramkaBagazowa extends Bramka implements Odprawa {
	

	private Map<Bilet, Set<Bagaz>> bagaze = new HashMap<>();

	@Override
	public void zdajBagaz(Bilet bilet, Bagaz bagaz) {
		if(bagaze.containsKey(bilet)) {
			Set<Bagaz> juzOddane = new HashSet<>();
			juzOddane.addAll(bagaze.get(bilet));
			juzOddane.add(bagaz);
			bagaze.replace(bilet, juzOddane);
		}else {
			Set<Bagaz> oddanyBagaz = new HashSet<>();
			oddanyBagaz.add(bagaz);
			bagaze.put(bilet, oddanyBagaz);
		}
		
	}



}
