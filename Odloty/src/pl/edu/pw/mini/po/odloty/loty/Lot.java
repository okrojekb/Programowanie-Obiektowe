package pl.edu.pw.mini.po.odloty.loty;


public class Lot implements Comparable<Lot>{

	protected String godzina;
	protected String idLotu;
	protected String linia;
	
	public void apply(LotVisitor lotVisitor) {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lot other = (Lot) obj;
		if (idLotu != other.idLotu)
			return false;
		return true;
	}

	@Override
	public int compareTo(Lot o) {
		int wynik;
		if(this.idLotu.length() > o.idLotu.length()) {
			wynik = 1;
		} else if(this.idLotu.length() > o.idLotu.length()) {
			wynik = 0;
		} else {
			wynik = -1;
		}
		return wynik;
	}
	
	

}
