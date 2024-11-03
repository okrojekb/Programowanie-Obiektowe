package pl.edu.pw.mini.po.terminal.pasazer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import pl.edu.pw.mini.po.terminal.bagaze.BagazGlowny;
import pl.edu.pw.mini.po.terminal.bagaze.BagazPodreczny;

public class Pasazer {

	private static final Random random = new Random();
	private Set<BagazGlowny> bagazeGlowne = new TreeSet<>();
	private List<BagazPodreczny> bagazePodreczne = new LinkedList<>();

	public Pasazer() {

		int iloscBagazyGlownych = 2 + random.nextInt(2);
		for (int i = 0; i < iloscBagazyGlownych; i++) {
			bagazeGlowne.add(new BagazGlowny());
		}

		int iloscBagazyPodrecznych = 1 + random.nextInt(2);
		for (int i = 0; i < iloscBagazyPodrecznych; i++) {
			bagazePodreczne.add(new BagazPodreczny());
		}
	}

	public Set<BagazGlowny> oddajBagazeGlowne() {
		Set<BagazGlowny> oddane = new TreeSet<>();
		oddane.addAll(bagazeGlowne);
		bagazeGlowne.clear();
		return oddane;
	}

	public List<BagazPodreczny> getBagazePodreczne() {
		List<BagazPodreczny> oddane = new LinkedList<>();
		oddane.addAll(bagazePodreczne);
		return oddane;
	}

	public void usunBagazPodreczny(BagazPodreczny b) {
		bagazePodreczne.remove(b);
	}

	public void setBagazePodreczne(List<BagazPodreczny> bagazePodreczne) {
		this.bagazePodreczne = bagazePodreczne;
	}
	
	

}
