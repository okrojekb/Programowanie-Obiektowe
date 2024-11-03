package pl.edu.pw.mini.po.automat;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.automat.produkty.Napoj;
import pl.edu.pw.mini.po.automat.produkty.ProduktSpozywczy;
import pl.edu.pw.mini.po.automat.produkty.ProduktSpozywczyZMasa;

public class AutomatSprzedajacy implements Obsluga, Zakup {

	private static final Random random = new Random();
	private Set<ProduktSpozywczyZMasa> przekaski = new HashSet<>(15);
	private Set<Napoj> napoje = new LinkedHashSet<>(10);
	private List<ProduktSpozywczy> podajnik = new LinkedList<>();

	@Override
	public void randomOrder() {
		Iterator<Napoj> iteratorNapoje = napoje.iterator();
		Iterator<ProduktSpozywczyZMasa> iteratorPrzekaski = przekaski.iterator();

		if (!iteratorPrzekaski.hasNext() & !iteratorNapoje.hasNext()) {
			System.out.println("Towaru brak!");
		} else {
			ProduktSpozywczy kupiony;
			if (iteratorPrzekaski.hasNext() & !iteratorNapoje.hasNext()) {
				int los = random.nextInt(2);
				if (los == 0) {
					kupiony = iteratorPrzekaski.next();
					przekaski.remove(kupiony);
				} else {
					kupiony = iteratorNapoje.next();
					napoje.remove(kupiony);
				}
			} else if (iteratorPrzekaski.hasNext()) {
				kupiony = iteratorPrzekaski.next();
				przekaski.remove(kupiony);
			} else {
				kupiony = iteratorNapoje.next();
				napoje.remove(kupiony);
			}
			podajnik.add(kupiony);
		}
	}

	@Override
	public List<ProduktSpozywczy> getAll() {
		List<ProduktSpozywczy> zakupioneProdukty = new ArrayList<>();
		zakupioneProdukty.addAll(podajnik);
		zakupioneProdukty.sort(null);
		return zakupioneProdukty;
	}

	@Override
	public boolean put(ProduktSpozywczyZMasa przekaska) throws ZawartoscCukruPozaPrzedzialemException {
		if (przekaski.size() == 15) {
			return false;
		} else {
			if (przekaska.procentowaZawartoscCukruWMasiePozaZakresem()) {
				throw new ZawartoscCukruPozaPrzedzialemException();
			}
			przekaski.add(przekaska);
			return true;

		}
	}

	@Override
	public boolean putDrink(Napoj napoj) throws ZawartoscCukruPozaPrzedzialemException {
		if (napoje.size() == 10) {
			return false;
		} else {
			if (napoj.procentowaZawartoscCukruWMasiePozaZakresem()) {
				throw new ZawartoscCukruPozaPrzedzialemException();
			}
			napoje.add(napoj);
			return true;
		}
	}

}
