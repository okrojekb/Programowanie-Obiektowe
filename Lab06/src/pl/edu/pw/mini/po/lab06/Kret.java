package pl.edu.pw.mini.po.lab06;

import java.lang.reflect.Array;
import java.util.Random;
import pl.edu.pw.mini.po.lab06.Environment;

public class Kret implements MoleMotion {

	private int minWartoscOdzywcza = 200;
	private int maxWartoscOdzywcza = 240;
	private int wartoscOdzywcza;
	private ObiektZiemny[][] tablica; // JAK??????
	private Gatunek gatunek;

	public Kret(Gatunek g, ObiektZiemny[][] tab) {
		gatunek = g;
		wartoscOdzywcza = wylosuj(minWartoscOdzywcza, maxWartoscOdzywcza);
		tablica = tab;
	}

	protected int wylosuj(int min, int max) {
		Random random = new Random();
		int los = random.nextInt(min, max);
		return los;
	}

	@Override
	public void goMole() {
		int i = wylosuj(0,Array.getLength(tablica));
		int j = wylosuj(0,Array.getLength(tablica[0]));
		if(tablica[i][j] != null) {
			int skonsumowanaWartoscOdzywcza = tablica[i][j].getWartoscOdzywcza();
			wartoscOdzywcza += skonsumowanaWartoscOdzywcza;
			System.out.println("Mniam!\nSkonsumowana wartość odżywcza to: " + skonsumowanaWartoscOdzywcza + 
					"\nWiersz: " + i + " i kolumna: " + j + "\n");
			tablica[i][j]=null;			
		}else {
			System.out.println("Pusto :(\n");
		}
	}

	@Override
	public String getNutritionalValue() {
		String wartOdz = "wartoscOdzywcza";
		return wartOdz;
	}

	public String toString() {
		String str = "Wartosc odzywcza: " + wartoscOdzywcza + " i gatunek to " + gatunek;
		return str;
	}

}
