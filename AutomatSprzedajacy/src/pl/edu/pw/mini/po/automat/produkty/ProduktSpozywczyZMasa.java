package pl.edu.pw.mini.po.automat.produkty;

abstract public class ProduktSpozywczyZMasa extends ProduktSpozywczy {

	protected int masa;

	@Override
	double getSugarContent() {
		double masaCukru = masa * procentowaZawartoscCukruWMasie / 100;
		return masaCukru;
	}

	public int getMasa() {
		return masa;
	}

}
