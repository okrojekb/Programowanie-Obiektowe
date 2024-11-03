package pl.edu.pw.mini.po.lab10;

import java.io.File;
import java.io.IOException;

public class Demonstrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plik plik = new Plik();
		File f = new File(".");
		plik.wylistujZawartoscKataloguDwaWyzej(".");
		try {
			f.createNewFile();
			System.out.println(f.getCanonicalPath());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}
