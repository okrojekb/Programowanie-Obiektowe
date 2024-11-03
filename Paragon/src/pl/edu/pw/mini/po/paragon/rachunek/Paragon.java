package pl.edu.pw.mini.po.paragon.rachunek;

public class Paragon extends Rachunek {
	
	private int nrParagonu;
	private boolean czyFiskalny;
	private String nipWystawiajacego;
	

	public Paragon(int n, boolean c, String nip, String o, double k, String d) {
		nrParagonu = n;
		czyFiskalny = c;
		nipWystawiajacego = nip;
		opis = o;
		kwota = k;
		data = new Data(d);
	}

}
