package pl.edu.pw.mini.po.zadanie3.lodki;

import java.util.Scanner;

public class LodkiLokalizacja {
	
	private double dlugosc;
	private double szerokosc;

	public LodkiLokalizacja(String l) {
		Scanner scanner = new Scanner(l);
		scanner.useDelimiter(";");
		dlugosc = scanner.nextDouble();
		szerokosc = scanner.nextDouble();
		
		scanner.close();
	}

	@Override
	public String toString() {
		return "Lokalizacja [dlugosc=" + dlugosc + "E" +  ", szerokosc=" + szerokosc + "N]";
	}
	
	

}
