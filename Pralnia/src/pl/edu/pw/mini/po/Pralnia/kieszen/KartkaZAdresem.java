package pl.edu.pw.mini.po.Pralnia.kieszen;

public class KartkaZAdresem extends ElementKieszeni {

	private String ulica;
	private int nrDomu;
	
	public KartkaZAdresem(String ul) {
		ulica = ul;
		nrDomu = 1 + random.nextInt(222);
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KartkaZAdresem other = (KartkaZAdresem) obj;
		if (nrDomu != other.nrDomu)
			return false;
		if (ulica == null) {
			if (other.ulica != null)
				return false;
		} else if (!ulica.equals(other.ulica))
			return false;
		return true;
	}
	
	

}
