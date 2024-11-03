package pl.edu.pw.mini.po.zadanie3.processor;

import java.util.LinkedList;
import java.util.List;


import pl.edu.pw.mini.po.zadanie3.lodki.HouseBoat;
import pl.edu.pw.mini.po.zadanie3.lodki.HouseBoatsVisitor;
import pl.edu.pw.mini.po.zadanie3.lodki.JednostkaPlywajaca;

public class GetHouseBoatsVisitor implements HouseBoatsVisitor{

	private List<JednostkaPlywajaca> wybrane = new LinkedList();

	
	@Override
	public void visitHouseBoat(HouseBoat houseBoat) {
		if(!houseBoat.isCzyPoimprezowy()) {
			wybrane.add(houseBoat);
		}
	}
	

	public List<JednostkaPlywajaca> getWybrane() {
		return new LinkedList(wybrane);
	}


	

}
