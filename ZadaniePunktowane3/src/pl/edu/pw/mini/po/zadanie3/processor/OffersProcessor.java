package pl.edu.pw.mini.po.zadanie3.processor;

import java.util.LinkedList;
import java.util.List;


import pl.edu.pw.mini.po.zadanie3.lodki.JednostkaPlywajaca;

public class OffersProcessor {

	private List<JednostkaPlywajaca> oferty;
	
	public OffersProcessor(List<JednostkaPlywajaca> oferty) {
		this.oferty = oferty;
	}
	
	public List<JednostkaPlywajaca> getAtMostFourSelectedHouseBoatOffers(){
		GetHouseBoatsVisitor getHouseBoatsVisitor = new GetHouseBoatsVisitor();
		for(JednostkaPlywajaca l: oferty) {
			l.apply(getHouseBoatsVisitor);
		}
		return getHouseBoatsVisitor.getWybrane();
	}

}
