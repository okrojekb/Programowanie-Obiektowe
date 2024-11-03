package pl.edu.pw.mini.po.Bozena;

public class PrzeciwpiechotnaMina extends Mina {

	private Obudowa obudowa;

	public PrzeciwpiechotnaMina() {
		super();
		ustawObudowe();
		ustawEkologiczna();

	}
	@Override
	protected void ustawEkologiczna() {
		if (obudowa == Obudowa.KARTON) {
			ekologiczna = true;
		} else {
			ekologiczna = false;

		}
	}
	

	private void ustawObudowe() {
		Obudowa[] opcje = Obudowa.values();
		obudowa = opcje[random.nextInt(opcje.length)];
	}
	
	public String toString() {
		String str = "x";
		return str;
	}
	
	public void pressMe() {
		if(czy_uzbrojona == true) {
			System.out.println("Boom!");
		}else {
			System.out.println("Chrup");
		}
	}

}
