package pl.edu.pw.mini.po.zadanie1.demo;

import pl.edu.pw.mini.po.zadanie1.KomorkaTerenowa;

public class Bocian extends Szybowiec{
	
	public Bocian(KomorkaTerenowa[][] t, int w, int wys) {
		super(t, w, wys);
	}

	
	
	public String toString() {
		String str = "Klasa: " + this.getClass().getSimpleName() + super.getInfo();
		return str;
	}
	
	public void fly() {
		super.fly();
		if(obecnaWysokosc!=0) {
			System.out.println("Lece jak prawdziwy Bocian!");
		}
	}

}
