package pl.edu.pw.mini.po.Pralnia.klient;

import java.util.Set;

import pl.edu.pw.mini.po.Pralnia.pralnia.ObslugaPralni;
import pl.edu.pw.mini.po.Pralnia.pralnia.OdbezpieczonyGranatException;
import pl.edu.pw.mini.po.Pralnia.ubrania.ElementGarderoby;
import pl.edu.pw.mini.po.Pralnia.ubrania.Koszula;
import pl.edu.pw.mini.po.Pralnia.ubrania.Kufajka;
import pl.edu.pw.mini.po.Pralnia.ubrania.Plaszcz;

public class Klient {

	private ObslugaPralni obslugaPralni;

	public Klient(ObslugaPralni obslugaPralni) {
		this.obslugaPralni = obslugaPralni;
	}

	public void doJob() {
		ElementGarderoby koszula = new Koszula();
		ElementGarderoby plaszcz = new Plaszcz();
		ElementGarderoby kufajka = new Kufajka();
		obslugaPralni.putToWash(koszula);
		obslugaPralni.putToWash(plaszcz);
		obslugaPralni.putToWash(kufajka);
		try {
			obslugaPralni.washAll();
			Set<ElementGarderoby> odebrane = obslugaPralni.pickUpWashedClothes();
			for (ElementGarderoby el : odebrane) {
				obslugaPralni.getPocketStuffByClothes(el);
			}
		} catch (OdbezpieczonyGranatException exc) {
			exc.printStackTrace();
		}

	}

}
