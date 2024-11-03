package pl.edu.pw.mini.po.Bozena;

public class Mina extends ElementPodloza {

	private static int licznik = 1;
	protected int identyfikator;
	protected boolean czy_uzbrojona = false;

	public Mina() {
		super();
		identyfikator = licznik * 10;
		licznik++;
	}

	public void armMe() {
		czy_uzbrojona = true;
	}

}
