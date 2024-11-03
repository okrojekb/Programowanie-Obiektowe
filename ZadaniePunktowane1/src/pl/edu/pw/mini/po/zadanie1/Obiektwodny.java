package pl.edu.pw.mini.po.zadanie1;

public class Obiektwodny extends KomorkaTerenowa{
	
	protected boolean spelniaWymogiNatura2000;
	
	public Obiektwodny() {
		ustawSpelniaWymogiNatura2000();
	}
	
	protected void ustawSpelniaWymogiNatura2000() {
		int los = random.nextInt(2);
		if(los == 0) {
			spelniaWymogiNatura2000 = true;
		}else {
			spelniaWymogiNatura2000 = false;
		}
	}
	
	public double getPradyNoszace() {
		double prady;
		prady = 0.1*temperatura - (random.nextInt(4)+1);
		return prady;
	}
	
	public void modyfikujTemperature(int deltaT) {
		super.modyfikujTemperature(deltaT);
		if (temperatura>20) {
			temperatura = 20;
		}
		
	}

}
