package pl.edu.pw.mini.po.grzybobranie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoGrzybobranie {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		MuchomorCesarski mc= new MuchomorCesarski();
		
		MuchomorKolczastoglowy mk= new MuchomorKolczastoglowy();
		
		MuchomorSromotnikowy msr= new MuchomorSromotnikowy();
		
		MuchomorSzarawy msz= new MuchomorSzarawy();

		/*
		System.out.print(mc);
		
		System.out.print(mk);

		System.out.print(msr);

		System.out.print(msz);

		mc.ugotuj();
		
		System.out.print("po:" + mc);
		
		msz.ugotuj();
		
		System.out.print("po:" + msz);

		System.out.print(mc.isTrujacy());
		System.out.print(mk.isTrujacy());
		System.out.print(msz.isTrujacy());
		System.out.println(msr.isTrujacy());
		*/
		Las las = new Las(5,3);
		System.out.println(Arrays.deepToString(las.tablica));
		
		System.out.println(las.zwrocGrzyba());
		
		GetGrzyb dostawca = new Las(100,100);
		
		KonsumentGrzybow kon = new KonsumentGrzybow( dostawca);
		
		kon.konsumujGrzyby(60);





	}
		
}
