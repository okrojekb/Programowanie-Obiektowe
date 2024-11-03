package pl.edu.pw.mini.po.terminal.pasazer;

import java.util.Random;

public class Bilet {
	
	private static final Random random = new Random();
	private String imie;
	private String nazwisko;
	private int numerLoteryjny;

	public Bilet(String n) {
		
		numerLoteryjny= 1 +random.nextInt(10000000);
		
		int los =1+ random.nextInt(10);
		switch(los) {
		case 1:
			imie = "A";
		case 2:
			imie = "B";
		case 3:
			imie = "C";
		case 4:
			imie = "D";
		case 5:
			imie = "E";
		case 6:
			imie = "F";
		case 7:
			imie = "G";
		case 8:
			imie = "H";
		case 9:
			imie = "I";
		default:
			imie = "J";
		}
		nazwisko = n;
	}

}
