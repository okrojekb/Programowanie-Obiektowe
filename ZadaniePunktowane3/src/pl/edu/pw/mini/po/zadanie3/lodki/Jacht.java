package pl.edu.pw.mini.po.zadanie3.lodki;

public class Jacht extends JednostkaPlywajaca {
	
	private int przedplata;

	public Jacht(String id, String model, String port, String lokalizacja, double cena, int p) {
		super(id, model, port, lokalizacja, cena);
		przedplata = p;
		
	}

}
