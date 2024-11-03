package pl.edu.pw.mini.po.Bozena;

public class Trawa extends Roslina {

	private static final double minWysokosc = 10.5;
	private static final double maxWysokosc = 50.5;

	public Trawa() {
		super(minWysokosc, maxWysokosc);

	}
	
	public String toString() {
		String str = "|";
		return str;
	}
	
	public void pressMe() {
		System.out.println("Chrup");
	}

}
