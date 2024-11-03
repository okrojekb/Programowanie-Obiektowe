package pl.edu.pw.mini.po.Bozena;

import java.lang.reflect.Array;
import java.util.Random;

public class Bozena implements CleanRow{
	
	private final static Random random = new Random();
	private ElementPodloza[][] tablica;
	
	public Bozena (ElementPodloza[][] t) {
		tablica = t;
	}
	
	public void destroyMines() {
		int wybranyWiersz = random.nextInt(Array.getLength(tablica));
		for(int j = 0; j<Array.getLength(tablica[wybranyWiersz]); j++) {
			if(tablica[wybranyWiersz][j]!=null) {
				tablica[wybranyWiersz][j].pressMe();
				tablica[wybranyWiersz][j] = null;
			}
		}
	}

}
