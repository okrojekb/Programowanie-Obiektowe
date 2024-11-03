package pl.edu.pw.mini.po.automat.kupiec;

import java.util.List;
import java.util.Random;

import pl.edu.pw.mini.po.automat.Zakup;
import pl.edu.pw.mini.po.automat.produkty.ProduktSpozywczy;
import pl.edu.pw.mini.po.automat.produkty.ProduktSpozywczyZMasa;

public class Kupiec {

	private static final Random random = new Random();
	private static int idCounter = 1;
	private int id;
	private Zakup zakup;

	public Kupiec(Zakup z) {
		id = idCounter;
		idCounter++;
		zakup = z;
	}

	public double doJob() {
		int iloscWywolan = 5 + random.nextInt(6);
		for (int i = 0; i < iloscWywolan; i++) {
			zakup.randomOrder();
		}
		List<ProduktSpozywczy> zakupioneProdukty = zakup.getAll();
		double sumaMas = 0;
		int iloscZakupionychPrzekasek = 0;
		for (ProduktSpozywczy el : zakupioneProdukty) {
			if (el instanceof ProduktSpozywczyZMasa) {
				sumaMas += ((ProduktSpozywczyZMasa) el).getMasa();
				iloscZakupionychPrzekasek++;
			}
		}
		double sredniaMas = sumaMas / iloscZakupionychPrzekasek;
		return sredniaMas;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Kupiec other = (Kupiec) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
