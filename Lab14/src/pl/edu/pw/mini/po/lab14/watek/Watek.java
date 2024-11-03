package pl.edu.pw.mini.po.lab14.watek;

import java.util.Random;

public class Watek extends Thread{
	
	private String message;
	

	public Watek(String message) {
		this.message = message;
	}

	

	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			try {
				sleep(500);
				System.out.println(message);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
