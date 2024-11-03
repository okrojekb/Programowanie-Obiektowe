package pl.edu.pw.mini.po.lab06;

import java.util.Random;

public class ObiektZiemny {

	protected int wartoscOdzywcza;

	public ObiektZiemny(int wO) {
		wartoscOdzywcza = wO;
	}
	
	public int getWartoscOdzywcza() {
		return wartoscOdzywcza;
	}

	protected double wylosuj(double min, double max) {
		Random random = new Random();
		double los = min + (random.nextDouble() * (max - min));
		return los;
	}
	
	public String toString() {
		String str = "wartosc odzywcza: " + wartoscOdzywcza;
		return str;
	}
}
