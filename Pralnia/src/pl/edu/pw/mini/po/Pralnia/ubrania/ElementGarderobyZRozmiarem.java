package pl.edu.pw.mini.po.Pralnia.ubrania;

public class ElementGarderobyZRozmiarem extends ElementGarderoby {

	protected int rozmiar;

	public ElementGarderobyZRozmiarem() {
		super();
		rozmiar = 35 + random.nextInt(6);
	}

}
