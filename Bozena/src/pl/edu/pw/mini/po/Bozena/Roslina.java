package pl.edu.pw.mini.po.Bozena;

public class Roslina extends ElementPodloza {

	protected double wysokosc;

	public Roslina(double minW, double maxW) {
		super();
		ustawWysokosc(minW, maxW);
	}

	private void ustawWysokosc(double minW, double maxW) {
		wysokosc = minW + random.nextDouble() * (maxW - minW);
	}

}
