package pl.edu.pw.mini.po.odloty.loty;

public class Wylot extends Lot {
	
	protected String dokad;
	protected WylotStatus status;
	protected WylotZakresCheckIn checkIn;

	public Wylot(String g, String d, String i, String l, WylotStatus s, WylotZakresCheckIn c) {
		godzina = g;
		dokad = d;
		idLotu = i;
		linia = l;
		status = s;
		checkIn = c;
		
	}

}
