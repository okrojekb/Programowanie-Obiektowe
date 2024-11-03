package pl.edu.pw.mini.po.zadanie1;

public class Gleba extends KomorkaTerenowa{
	
	protected double gestosc;
	
	
	protected void ustawGestosc(double minG, double maxG) {
		gestosc = minG + (random.nextDouble() * (maxG - minG));
	}
	
	public double getPradyNoszace() {
		double prady;
		prady = 0.66*temperatura / 8;
		return prady;
	}
	
	
	public void modyfikujTemperature(int deltaT) {
		super.modyfikujTemperature(deltaT);
		if (temperatura>40) {
			temperatura = 40;
		}
		
	}

}
