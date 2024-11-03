package pl.edu.pw.mini.po.Pralnia.kieszen;

public class Guzik extends ElementKieszeni {

	private static int idCounter = 1;
	private int id;

	public Guzik() {
		id = idCounter;
		idCounter++;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guzik other = (Guzik) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
