package pl.edu.pw.mini.po.lab06;

public class Zwierze extends ObiektZiemny {

	protected double masa;

	public Zwierze(int wO, double minM, double maxM) {
		super(wO);
		masa = wylosuj(minM, maxM);
	}

	public String toString() {
		String str = super.toString() + " i masa: " + masa;
		return str;
	}

}
