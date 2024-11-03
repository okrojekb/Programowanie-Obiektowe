package pl.edu.pw.mini.po.odloty.loty;

public class ZlyZakresStoiskCheckInException extends Exception {



	public ZlyZakresStoiskCheckInException(int nrStoiskOd,  int nrStoiskDo) {
		super("Niepoprawny zakres nr stoisk check-in. Podano zakres: " + nrStoiskOd + "-" + nrStoiskDo);
		// TODO Auto-generated constructor stub
	}
}