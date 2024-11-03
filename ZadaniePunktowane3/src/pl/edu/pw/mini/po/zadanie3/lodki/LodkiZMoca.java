package pl.edu.pw.mini.po.zadanie3.lodki;

public class LodkiZMoca extends JednostkaPlywajaca {

	protected int mocSilnikow;

	public LodkiZMoca(String id, String model, String port, String lokalizacja, double cena, int m) {
		super(id, model, port, lokalizacja, cena);
		mocSilnikow = m;
	}

}
