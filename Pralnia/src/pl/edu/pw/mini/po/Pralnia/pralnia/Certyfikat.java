package pl.edu.pw.mini.po.Pralnia.pralnia;

import java.util.Random;

public class Certyfikat {
	
	
	private static Random random = new Random();
	private String nazwa;
	
	public Certyfikat() {
		nazwa = losowyString();
	}

	public String toString() {
		return nazwa;
	}
	
	private String losowyString() {
		int dlugosc = 3 + random.nextInt(15);
		String str = "";
		for (int i = 0; i < dlugosc; i++) {
			str += (char) (97 + random.nextInt(26));
		}
		return str;
	}

}
