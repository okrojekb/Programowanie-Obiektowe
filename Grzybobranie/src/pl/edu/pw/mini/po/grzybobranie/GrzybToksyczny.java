package pl.edu.pw.mini.po.grzybobranie;

public class GrzybToksyczny extends Grzyb {

	protected Toksyny toksyny;

	public GrzybToksyczny(int minm, int maxm) {
		super(minm, maxm);
	}

	protected boolean isTrujacy() {
		if (toksyny == Toksyny.NIEOBECNE) {
			return super.isTrujacy();
		} else {
			return true;
		}
	}

}
