package pl.edu.pw.mini.po.Pralnia.ubrania;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.Pralnia.kieszen.*;

import pl.edu.pw.mini.po.Pralnia.kieszen.ElementKieszeni;

public class ElementGarderoby {

	protected static Random random = new Random();
	protected boolean czystosc = false;
	protected List<ElementKieszeni> kieszen = new LinkedList<ElementKieszeni>();

	public ElementGarderoby() {
		int iloscElementowKieszeni = 1 + random.nextInt(3);
		ElementKieszeni el;
		for (int i = 0; i < iloscElementowKieszeni; i++) {
			int los = random.nextInt(3);
			switch (los) {
			case 0:
				el = new Guzik();
				break;
			case 1:
				String ul = losowyString();
				el = new KartkaZAdresem(ul);
				break;
			default:
				el = new Granat();
			}
			kieszen.add(el);
		}
	}

	private String losowyString() {
		int dlugosc = 3 + random.nextInt(15);
		String str = "";
		for (int i = 0; i < dlugosc; i++) {
			str += (char) (97 + random.nextInt(26));
		}
		return str;
	}

	public Set<ElementKieszeni> oproznijKieszen() {
		Set<ElementKieszeni> zawartosc = new HashSet<>();
		zawartosc.addAll(kieszen);
		kieszen.clear();
		return zawartosc;
	}

	public void pranie() {
		czystosc = true;
	}
}
