package pl.edu.pw.mini.po.terminal.bramki;

import pl.edu.pw.mini.po.terminal.bagaze.Bagaz;
import pl.edu.pw.mini.po.terminal.pasazer.Pasazer;

public interface Kontrola {
	
	public boolean skanujBagaz(Bagaz bagaz, Pasazer pas) throws KielbasaException;

}
