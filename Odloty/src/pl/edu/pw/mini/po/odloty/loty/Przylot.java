package pl.edu.pw.mini.po.odloty.loty;

public class Przylot extends Lot {
	
	protected String skad;
	protected boolean czyWyladowal;
	protected int nrWyjscia;

	public Przylot(String g, String s, String i, String l, boolean c, int w) {
		godzina = g;
		skad = s;
		idLotu = i;
		linia = l;
		czyWyladowal = c;
		nrWyjscia = w;
	}
	
	@Override
	public void apply(LotVisitor lotVisitor) {
		lotVisitor.getPrzylot(this);
	}

	public boolean isCzyWyladowal() {
		return czyWyladowal;
	}
	
	

}
