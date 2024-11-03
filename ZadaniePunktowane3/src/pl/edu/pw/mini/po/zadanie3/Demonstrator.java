package pl.edu.pw.mini.po.zadanie3;

import java.util.List;

import pl.edu.pw.mini.po.zadanie3.lodki.JednostkaPlywajaca;
import pl.edu.pw.mini.po.zadanie3.parser.OffersParser;
import pl.edu.pw.mini.po.zadanie3.parser.PowtarzajacaSieOfertaException;
import pl.edu.pw.mini.po.zadanie3.processor.OffersProcessor;



public class Demonstrator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OffersParser o = new OffersParser();
		
		try {
			List<JednostkaPlywajaca> oferty = o.parsenonDuplicatedOffers("/oferty_czarterowe.txt");
			OffersProcessor p = new OffersProcessor(oferty);
			p.getAtMostFourSelectedHouseBoatOffers();
			
			o.parsenonDuplicatedOffers("/oferty_czarterowe_error.txt");


		} catch (PowtarzajacaSieOfertaException e) {
			e.printStackTrace();
		}
		
	


	}

}
