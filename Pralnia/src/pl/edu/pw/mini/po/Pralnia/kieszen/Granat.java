package pl.edu.pw.mini.po.Pralnia.kieszen;

public class Granat extends ElementKieszeni {

	private boolean odbezpieczony;

	public Granat() {
		int los = random.nextInt(10);
		if (los == 9) {
			odbezpieczony = true;
		} else {
			odbezpieczony = false;
		}
	}

	public boolean czyOdbezpieczony() {
		if (odbezpieczony) {
			return true;
		} else {
			return false;
		}
	}

}
