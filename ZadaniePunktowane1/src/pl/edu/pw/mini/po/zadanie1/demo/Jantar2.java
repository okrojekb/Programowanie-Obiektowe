package pl.edu.pw.mini.po.zadanie1.demo;

import pl.edu.pw.mini.po.zadanie1.KomorkaTerenowa;

public class Jantar2 extends Szybowiec{
	
	
	public Jantar2(KomorkaTerenowa[][] t, int w, int wys) {
		super(t, w, wys);
	}

	
	
	public String toString() {
		String str = "Klasa: " + this.getClass().getSimpleName() + super.getInfo();
		return str;
	}
	
	public void fly() {
		super.fly();
		System.out.println("Aktualna wysokosc: " + obecnaWysokosc);
	}

}
