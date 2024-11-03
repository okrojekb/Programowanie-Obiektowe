package pl.edu.pw.mini.po.terminal.przedmioty;

import java.util.Random;

public class PrzedmiotNielegalny extends Przedmiot{
	
	protected int masa;
	protected Random random = new Random();

	public PrzedmiotNielegalny() {
		masa = wylosujIntZZakresu(5,28);
		stopienNielegalnosci = masa*10;
	}
	
	protected int wylosujIntZZakresu(int min, int max) {
		int wynik = min + random.nextInt((max-min)+1);
		return wynik;
	}

}
