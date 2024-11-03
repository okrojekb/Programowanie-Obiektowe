package pl.edu.pw.mini.po.Bozena;

public class Purchawka extends Roslina {

	private static final double minWysokosc = 3.5;
	private static final double maxWysokosc = 7.5;

	public Purchawka() {
		super(minWysokosc, maxWysokosc);
	}

	@Override
	protected void ustawEkologiczna() {
		ekologiczna = random.nextBoolean();
	}
	
	public String toString() {
		String str = "o";
		return str;
	}
	
	public void pressMe() {
		System.out.println("Puffff");
	}

}
