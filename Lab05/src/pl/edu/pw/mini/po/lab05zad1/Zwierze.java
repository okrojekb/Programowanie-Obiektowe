package pl.edu.pw.mini.po.lab05zad1;

import java.util.Random;

public class Zwierze {
	private int iloscZebow;
	
	int wylosuj(int a, int b)
	{
		Random random = new Random();
		return random.nextInt(b-a)+a;
	}
	
}
