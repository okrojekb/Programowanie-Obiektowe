package pl.edu.pw.mini.po.file;

import java.util.Scanner;

public class Czlowiek {
	
	public String imie;
	public String nazwisko;
	public double srednia;
	public int wiek;

	public Czlowiek(String str) {
		// TODO Auto-generated constructor stub
		Scanner scanner = new Scanner(str);
		
		while(scanner.hasNextLine()) {
			scanner.useDelimiter("-");
			imie = scanner.next();
			nazwisko = scanner.next();
			srednia = scanner.nextDouble();
			wiek = scanner.nextInt();
		}
		scanner.close();
	}

}
