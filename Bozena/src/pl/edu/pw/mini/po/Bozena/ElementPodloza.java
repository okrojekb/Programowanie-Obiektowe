package pl.edu.pw.mini.po.Bozena;

import java.util.Random;

public class ElementPodloza {
	protected boolean ekologiczna;
	protected final static Random random = new Random();

	public ElementPodloza() {
		ustawEkologiczna();
	}

	protected void ustawEkologiczna() {
		ekologiczna = true;
	}
	
	public String toString() {
		String str = " ";
		return str;
	}
	
	public void pressMe() {		
	}

}
