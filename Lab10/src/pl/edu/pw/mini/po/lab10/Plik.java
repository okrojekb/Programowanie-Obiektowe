package pl.edu.pw.mini.po.lab10;

import java.io.File;

public class Plik {

	
	public void wylistujZawartoscKataloguDwaWyzej(String path){
		String path2 = path + "/../..";
		File file = new File(path2);
		File[] listaPlikow = file.listFiles();
		String nazwa;
		String rodzaj;
		String[] m;
		
		for(File f : listaPlikow) {
			nazwa = f.getName();
			if(f.isDirectory()) {
				rodzaj = "Directory";
			}else {
				rodzaj = "File";
			}
			System.out.println(nazwa);
			System.out.println(rodzaj);
			//m = new String []{nazwa, rodzaj};
			//System.out.println(m);
		}
		
		return;

	}
	
	public void dodajNKatalogow(int N, String path) {
		
	}

}
