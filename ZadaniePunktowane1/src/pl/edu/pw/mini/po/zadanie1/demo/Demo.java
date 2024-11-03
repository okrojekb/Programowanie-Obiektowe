package pl.edu.pw.mini.po.zadanie1.demo;

import java.lang.reflect.Array;
import java.util.Random;

public class Demo {

	public static void main(String[] args) {
		
		for(int k = 0; k<3; k++) {
			Kontrola kon = new Kontrola(20,20);
			Random random = new Random();
			int wiersz = random.nextInt(Array.getLength(kon.getTablica()));
			Bocian boc = new Bocian(kon.getTablica(), wiersz, 50);;
			for(int i = 0; i< 20; i++) {
				if(i%2==0) {
					kon.modyfikujAtmosfere();
				}else  {
					boc.fly();
					System.out.println(boc);
				}
				
			}
		}

	}

}
