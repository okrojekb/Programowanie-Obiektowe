package pl.edu.pw.mini.po.terminal.pasazer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GeneratorBiletow {
	private Map<String, List<String>> osoby = new HashMap<>();

	public GeneratorBiletow() {
		List<String> nazwiska = new LinkedList<>();
		nazwiska.add("A");
		nazwiska.add("B");
		nazwiska.add("C");
		nazwiska.add("D");
		nazwiska.add("E");
		nazwiska.add("F");
		nazwiska.add("G");
		nazwiska.add("H");
		nazwiska.add("I");
		nazwiska.add("J");
		osoby.put("A", nazwiska);
		osoby.put("B", nazwiska);
		osoby.put("C", nazwiska);
		osoby.put("D", nazwiska);
		osoby.put("E", nazwiska);
		osoby.put("F", nazwiska);
		osoby.put("G", nazwiska);
		osoby.put("H", nazwiska);
		osoby.put("I", nazwiska);
		osoby.put("J", nazwiska);

	}
	
	public String getNazwisko(String i){
		//TODO
		List<String> nazwiska = new LinkedList<>();
		nazwiska.addAll(osoby.get(i));
		return "";
		


	}
	

}
