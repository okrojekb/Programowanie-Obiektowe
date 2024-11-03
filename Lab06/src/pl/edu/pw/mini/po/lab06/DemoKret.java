package pl.edu.pw.mini.po.lab06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoKret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gleba ziemia = new Gleba(7);
		System.out.println(ziemia);

		Larwa larwa = new Larwa(3);
		System.out.println(larwa);

		Dzdzownica dzdz = new Dzdzownica(5);
		System.out.println(dzdz);
		
		Environment env = new Environment(10,10, 3, 4);
		System.out.println(env);
		
		Environment env2 = new Environment(5,5, 3, 4, Gatunek.CINEREA);
		System.out.println(env2);
		
		env2.runMole();

	}

}
