package pl.edu.pw.mini.po.grzybobranie;

public class MuchomorCesarski extends Grzyb {

	private static int minMasaOwocnika = 50;
	private static int maxMasaOwocnika = 75;

	public MuchomorCesarski() {
		super(minMasaOwocnika, maxMasaOwocnika);
		twardosc = ustawTwardosc();
	}
	
	protected Twardosc ustawTwardosc() {
		Twardosc tw = Twardosc.TWARDY;
		return tw; 
	}
	
	public String toString() {
		String str = "Nazwa: Muchomor Cesarski, Twardosc to: " + twardosc + ", " + getInfo();
		return str;
	}


}
