package pl.edu.pw.mini.po.zadanie1;

public class Piasek extends KomorkaTerenowa{
	
	private Sypkosc sypkosc;
	
	public Piasek() {
		ustawSypkosc();
		
	}
	
	private void ustawSypkosc() {
		
		Sypkosc [] opcje = Sypkosc.values();
		sypkosc = opcje[random.nextInt(opcje.length)];
	}
	
	public double getPradyNoszace() {
		double prady;
		prady = 0.2*temperatura * random.nextDouble();
		return prady;
		

		
	}
	
	public void modyfikujTemperature(int deltaT) {
		super.modyfikujTemperature(deltaT);
		if (temperatura>50) {
			temperatura = 50;
		}
		
	}



}
