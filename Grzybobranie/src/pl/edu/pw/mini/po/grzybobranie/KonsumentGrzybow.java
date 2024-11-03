package pl.edu.pw.mini.po.grzybobranie;

public class KonsumentGrzybow {

	//private Grzyb[][] tablica;
	private GetGrzyb dostawcaGrzybow;

	public KonsumentGrzybow( GetGrzyb dost) {
		//tablica = t;
		dostawcaGrzybow = dost;
	}

	public void konsumujGrzyby(int n) {
		// n z zakresu (50;100)
		Grzyb grzyb;
		for (int i = 0; i < n; i++) {
			grzyb = dostawcaGrzybow.zwrocGrzyba();
			if(grzyb != null) {
				grzyb.ugotuj();
				if (zjedzGrzyb(grzyb) == 1) {
					break;
			}
			}
		}

	}

	private int zjedzGrzyb(Grzyb grzyb) {
		int czy_trujacy = 0;
		if (grzyb.isTrujacy()) {
			System.out.println("Uuuups!");
			czy_trujacy = 1;
		}
		return czy_trujacy;
	}
}
