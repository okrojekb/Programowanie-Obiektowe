package pl.edu.pw.mini.po.Pralnia.demonstrator;

import pl.edu.pw.mini.po.Pralnia.pralnia.Certyfikat;
import pl.edu.pw.mini.po.Pralnia.pralnia.Pralnia;
import pl.edu.pw.mini.po.Pralnia.swiat.Swiat;
import pl.edu.pw.mini.po.Pralnia.ubrania.Koszula;

public class Demonstrator {

	public static void main(String[] args) {
		Swiat swiat = new Swiat();
		swiat.goLive();
		Certyfikat cer = new Certyfikat();
		Pralnia<Certyfikat> pr = new Pralnia<>(cer);
		pr.retrieveCertificate();
	}

}
