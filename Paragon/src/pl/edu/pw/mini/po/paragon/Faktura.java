package pl.edu.pw.mini.po.paragon;

import pl.edu.pw.mini.po.paragon.rachunek.Data;
import pl.edu.pw.mini.po.paragon.rachunek.Rachunek;

public class Faktura extends Rachunek {
	
	private String idFaktury;
	private String nip;
	private double kwotaVAT;

	public Faktura(String i, String n, String o, double k, double kV, String d) {

		idFaktury = i;
		nip = n;
		opis = o;
		kwota= k;
		kwotaVAT = kV;
		data = new Data(d);
	}

}
