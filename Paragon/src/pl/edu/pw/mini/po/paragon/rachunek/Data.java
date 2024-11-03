package pl.edu.pw.mini.po.paragon.rachunek;

import java.util.Scanner;

public class Data {
	
	private int dzien;
	private int miesiac;
	private int rok;
	
	public Data(String data) {
		Scanner scanner = new Scanner(data);
		scanner.useDelimiter("-");
		dzien = scanner.nextInt();
		miesiac = scanner.nextInt();
		rok = scanner.nextInt();

	}
	
	

}
