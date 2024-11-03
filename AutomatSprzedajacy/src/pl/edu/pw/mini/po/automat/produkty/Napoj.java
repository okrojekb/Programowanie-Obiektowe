package pl.edu.pw.mini.po.automat.produkty;

public class Napoj extends ProduktSpozywczy {

	private static final int minProcentowaZawartoscCukruWMasie = 8;
	private static final int maxProcentowaZawartoscCukruWMasie = 12;
	private static final int minObjetosc = 20;
	private static final int maxObjetosc = 50;
	private int objetosc;
	private static final int gestosc = 95;

	public Napoj() {
		procentowaZawartoscCukruWMasie = ustawIntZZakresuMinMax(minProcentowaZawartoscCukruWMasie,
				maxProcentowaZawartoscCukruWMasie);
		objetosc = ustawIntZZakresuMinMax(minObjetosc, maxObjetosc);

	}

	@Override
	double getSugarContent() {
		double masaCukru = (objetosc * gestosc / 100) * procentowaZawartoscCukruWMasie / 100;
		return masaCukru;
	}

}
