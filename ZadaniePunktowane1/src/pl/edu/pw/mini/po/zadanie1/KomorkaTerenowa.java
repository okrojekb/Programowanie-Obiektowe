package pl.edu.pw.mini.po.zadanie1;

import java.util.Random;


public class KomorkaTerenowa {
	
	protected int temperatura;
	protected static final Random random = new Random();
	

	
	public double getPradyNoszace() {
		double prady = 0.0;
		return prady;
	}
	
	public void modyfikujTemperature(int deltaT) {
		/*
		if(deltaT > 50 | deltaT < -20) {
			throw ZlaDeltaException;
		}
		*/
		temperatura += deltaT;
	}


}
