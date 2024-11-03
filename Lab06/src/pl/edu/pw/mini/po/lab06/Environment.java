package pl.edu.pw.mini.po.lab06;

import java.lang.reflect.Array;
import java.util.Random;
//import pl.edu.pw.mini.po.lab06.MoleMotion;

public class Environment {

	private static int minWartoscOdzywczaLarwy = 3;
	private static int maxWartoscOdzywczaLarwy = 5;
	private static final int wartoscOdzywczaDzdzownicy = 3;
	private static final int wartoscOdzywczaGleby = 0;
	private ObiektZiemny[][] tablica;
	private MoleMotion moleMotion; 
	private Kret kret;
	

	public Environment(int n, int m, int l, int d) {
		tablica = new ObiektZiemny[n][m];
		Random random = new Random();
		wstawLarwy(n, m, l, random);
		wstawDzdzownice(n, m, d, random);
		uzupelnijGleba(n, m);

	}
	
	public Environment(int n, int m, int l, int d, Gatunek g) {
		tablica = new ObiektZiemny[n][m];
		Random random = new Random();
		wstawLarwy(n, m, l, random);
		wstawDzdzownice(n, m, d, random);
		uzupelnijGleba(n, m);
		kret = new Kret(g, tablica);

	}

	private void wstawLarwy(int n, int m, int l, Random random) {
		for (int a = 0; a < l; a++) {
			int i, j;
			int losWartOdz = random.nextInt(minWartoscOdzywczaLarwy, maxWartoscOdzywczaLarwy + 1);
			Larwa larwa = new Larwa(losWartOdz);
			do {
				i = random.nextInt(n);
				j = random.nextInt(m);
			} while (null != (tablica[i][j]));
			tablica[i][j] = larwa;
		}
	}

	private void wstawDzdzownice(int n, int m, int d, Random random) {
		for (int a = 0; a < d; a++) {
			int i, j;
			Dzdzownica dzdzownica = new Dzdzownica(wartoscOdzywczaDzdzownicy);
			do {
				i = random.nextInt(n);
				j = random.nextInt(m);
			} while (null != (tablica[i][j]));
			tablica[i][j] = dzdzownica;
		}
	}
	
	private void uzupelnijGleba(int n, int m) {
		Gleba ziemia;
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				if(tablica[i][j] == null) {
					ziemia = new Gleba(wartoscOdzywczaGleby);
					tablica[i][j] = ziemia;
				}
			}
		}
	}
	
	public String toString(){
		ObiektZiemny ob;
		String str = "";
		for(int i = 0; i< Array.getLength(tablica); i++) {
			for(int j = 0; j< Array.getLength(tablica[i]); j++) {
				ob = tablica[i][j];
				if (ob==null){
					str+="   ";
				}else if(ob instanceof Gleba){
					str += " # ";
				}else if(ob instanceof Dzdzownica){
					str +="{ }";
				}else if(ob instanceof Larwa){
					str += " @ ";
				}
			}
			str+="\n";		
		}
		str+="\n";		
		return str;
	}
	
	public void runMole() {
		for(int i = 0; i<10; i++) {
			kret.goMole();
			System.out.print(this);;
		}
	}

}
