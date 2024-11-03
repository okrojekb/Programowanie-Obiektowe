package pl.edu.pw.mini.po.grzybobranie;

public class MuchomorSromotnikowy extends GrzybToksyczny {

	private static int minMasaOwocnika = 25;
	private static int maxMasaOwocnika = 75;

	public MuchomorSromotnikowy() {
		super(minMasaOwocnika, maxMasaOwocnika);
		twardosc = ustawTwardosc();
		toksyny = ustawToksyny(masaOwocnika);
	}

	private Toksyny ustawToksyny(int mO) {
		Toksyny toks;
		if (mO < 50) {
			toks = Toksyny.ZABÓJCZE;
		} else {
			toks = Toksyny.WYJĄTKOWO_ZABÓJCZE;
		}
		return toks;
	}

	public String toString() {
		String str = "Nazwa: Muchomor Sromotnikowy, Twardosc to: " + twardosc + ", " + getInfo() + ", Toksyny: "
				+ toksyny;
		return str;
	}
}
