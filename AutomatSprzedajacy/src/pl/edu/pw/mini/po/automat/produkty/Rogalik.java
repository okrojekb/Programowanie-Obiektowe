package pl.edu.pw.mini.po.automat.produkty;

public class Rogalik extends ProduktSpozywczyZMasa {

	private static final int minMasa = 20;
	private static final int maxMasa = 50;
	private static final int minProcentowaZawartoscCukruWMasie = 15;
	private static final int maxProcentowaZawartoscCukruWMasie = 30;

	public Rogalik() {
		masa = ustawIntZZakresuMinMax(minMasa, maxMasa);
		procentowaZawartoscCukruWMasie = ustawIntZZakresuMinMax(minProcentowaZawartoscCukruWMasie,
				maxProcentowaZawartoscCukruWMasie);
	}

}
