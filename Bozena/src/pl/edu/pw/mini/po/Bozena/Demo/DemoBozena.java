package pl.edu.pw.mini.po.Bozena.Demo;

import java.util.Arrays;

import pl.edu.pw.mini.po.Bozena.Bozena;
import pl.edu.pw.mini.po.Bozena.CleanRow;
import pl.edu.pw.mini.po.Bozena.ElementPodloza;
import pl.edu.pw.mini.po.Bozena.PoleMinowe;
import pl.edu.pw.mini.po.Bozena.PrzeciwczolgowaMina;
import pl.edu.pw.mini.po.Bozena.PrzeciwpiechotnaMina;
import pl.edu.pw.mini.po.Bozena.Purchawka;
import pl.edu.pw.mini.po.Bozena.Roslina;
import pl.edu.pw.mini.po.Bozena.Trawa;

public class DemoBozena {

	public static void main(String[] args) {
		
		

		
		
		Trawa t = new Trawa();
		System.out.println(t);

		Purchawka p = new Purchawka();
		System.out.println(p);
		
		PrzeciwpiechotnaMina pp = new PrzeciwpiechotnaMina();
		System.out.println(pp);
		
		PrzeciwczolgowaMina pc = new PrzeciwczolgowaMina();
		System.out.println(pc);
		//pc.armMe();
		pc.pressMe();;
		
		PoleMinowe pole = new PoleMinowe();
		
		Bozena bozena = new Bozena(pole.tablica);
		System.out.println(Arrays.deepToString(pole.tablica));
		
		CleanRow saper = bozena;
		for(int i =0; i<50; i++) {
			saper.destroyMines();

		}

		
		
	}

}
