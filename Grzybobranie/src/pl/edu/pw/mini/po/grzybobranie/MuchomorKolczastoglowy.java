package pl.edu.pw.mini.po.grzybobranie;

public class MuchomorKolczastoglowy extends Grzyb{
	
	private static int minMasaOwocnika = 25;
	private static int maxMasaOwocnika = 50;

	public MuchomorKolczastoglowy() {
		super(minMasaOwocnika, maxMasaOwocnika);
		twardosc = ustawTwardosc();

	}
	
	public String toString() {
		String str = "Nazwa: Muchomor Kolczastogowy, Twardosc to: " + twardosc + ", " + getInfo();
		return str;
	}

}
