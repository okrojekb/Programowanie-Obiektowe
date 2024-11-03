package pl.edu.pw.mini.po.Pralnia.ubrania;

public class Plaszcz extends ElementGarderoby {

	private int waga;

	public Plaszcz() {
		super();
		waga = 5 + random.nextInt(6);
	}

}
