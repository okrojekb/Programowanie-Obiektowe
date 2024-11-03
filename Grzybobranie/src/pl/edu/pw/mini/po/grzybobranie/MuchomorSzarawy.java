package pl.edu.pw.mini.po.grzybobranie;

public class MuchomorSzarawy extends GrzybToksyczny {

	private static int minMasaOwocnika = 25;
	private static int maxMasaOwocnika = 75;
	private static final int rokOdkryciaGatunku = 1783;

	public MuchomorSzarawy() {
		super(minMasaOwocnika, maxMasaOwocnika);
		twardosc = ustawTwardosc();
		toksyny = ustawToksyny(masaOwocnika);
	}

	private Toksyny ustawToksyny(int mO) {
		Toksyny toks = Toksyny.TRUJĄCE;
		return toks;
	}

	public String toString() {
		String str = "Nazwa: Muchomor Szarawy, Twardosc to: " + twardosc + ", " + getInfo() + ", Toksyny: "
				+ toksyny + ", Rok odkrycia gatunku to: " + rokOdkryciaGatunku;
		return str;
	}
	
	protected void ugotuj() {
		super.ugotuj();
		toksyny = Toksyny.NIEOBECNE;
	}
}
