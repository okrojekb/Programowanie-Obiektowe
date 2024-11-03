package pl.edu.pw.mini.po.Pralnia.swiat;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.po.Pralnia.klient.Klient;
import pl.edu.pw.mini.po.Pralnia.pralnia.Certyfikat;
import pl.edu.pw.mini.po.Pralnia.pralnia.Pralnia;

public class Swiat {
	
	private List<Klient> klienci = new ArrayList<>();

	
	public void goLive() {
		Certyfikat certyfikat = new Certyfikat();
		Pralnia pralnia = new Pralnia<Certyfikat>(certyfikat);
		for(int i = 0; i<10; i++) {
			klienci.add(new Klient(pralnia));
		}
		for(Klient k : klienci) {
			k.doJob();
		}
	}

}
