package pl.edu.pw.mini.po.Pralnia.pralnia;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.edu.pw.mini.po.Pralnia.kieszen.ElementKieszeni;
import pl.edu.pw.mini.po.Pralnia.kieszen.Granat;
import pl.edu.pw.mini.po.Pralnia.ubrania.ElementGarderoby;

public class Pralnia<T> implements ObslugaPralni {
	
	private T certyfikat;
	private Set<ElementGarderoby> przyjeteDoPrania = new HashSet<ElementGarderoby>();
	private Set<ElementGarderoby> wyprane = new LinkedHashSet<ElementGarderoby>();
	private Map<ElementGarderoby, Set<ElementKieszeni>> zawartosciKieszeni = new HashMap<>();
	
	public Pralnia(T cer) {
		certyfikat = cer;
	}

	@Override
	public void putToWash(ElementGarderoby el) {
		przyjeteDoPrania.add(el);
	}

	@Override
	public void washAll() throws OdbezpieczonyGranatException {
		Iterator<ElementGarderoby> iterator = przyjeteDoPrania.iterator();
		while (iterator.hasNext()) {
			ElementGarderoby el = iterator.next();
			iterator.remove();
			Set<ElementKieszeni> rzeczyWKieszeni = new HashSet<>();
			for (ElementKieszeni elementKieszeni : el.oproznijKieszen()) {
				if (elementKieszeni instanceof Granat) {
					if (((Granat) elementKieszeni).czyOdbezpieczony()) {
						throw new OdbezpieczonyGranatException();
					}
				}
				rzeczyWKieszeni.add(elementKieszeni);
			}
			zawartosciKieszeni.put(el, rzeczyWKieszeni);
			el.pranie();
			wyprane.add(el);
		}
	}

	@Override
	public Set<ElementGarderoby> pickUpWashedClothes() {
		Set<ElementGarderoby> odbior = new LinkedHashSet<>();
		odbior.addAll(wyprane);
		wyprane.clear();
		return odbior;
	}

	@Override
	public Set<ElementKieszeni> getPocketStuffByClothes(ElementGarderoby el) {
		Set<ElementKieszeni> rzeczyZKieszeni = new HashSet<>();
		rzeczyZKieszeni.addAll(zawartosciKieszeni.get(el));
		zawartosciKieszeni.remove(el);
		return rzeczyZKieszeni;
	}
	
	public T retrieveCertificate() {
		System.out.println(certyfikat);
		return certyfikat;
	}

}
