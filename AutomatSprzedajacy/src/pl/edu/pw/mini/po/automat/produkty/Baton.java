package pl.edu.pw.mini.po.automat.produkty;

public class Baton extends ProduktSpozywczyZMasa {

	private static final int minMasa = 20;
	private static final int maxMasa = 50;
	private static final int minProcentowaZawartoscCukruWMasie = 30;
	private static final int maxProcentowaZawartoscCukruWMasie = 50;

	public Baton() {
		masa = ustawIntZZakresuMinMax(minMasa, maxMasa);
		procentowaZawartoscCukruWMasie = ustawIntZZakresuMinMax(minProcentowaZawartoscCukruWMasie,
				maxProcentowaZawartoscCukruWMasie);

	}

}
