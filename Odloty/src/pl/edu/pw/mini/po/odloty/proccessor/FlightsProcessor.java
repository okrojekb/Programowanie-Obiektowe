package pl.edu.pw.mini.po.odloty.proccessor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import pl.edu.pw.mini.po.odloty.loty.Lot;
import pl.edu.pw.mini.po.odloty.loty.LotVisitor;

public class FlightsProcessor {

	private List<Lot> loty;

	public FlightsProcessor(List<Lot> l) {
		loty = l;
		// TODO Auto-generated constructor stub
	}

	public List<Lot> getExpectedArrivals() {
		Iterator<Lot> iterator = loty.iterator();
		List<Lot> oczekiwane = new ArrayList();
		GetPrzylotVisitor getPrzylotVisitor = new GetPrzylotVisitor();

		Lot l;

		while (iterator.hasNext()) {
			l = iterator.next();
			l.apply(getPrzylotVisitor);
		}
		oczekiwane = getPrzylotVisitor.getOczekiwane();
		return oczekiwane;
	}

	public List<Lot> getFlightsOrdered() {
		List<Lot> posortowane = new ArrayList(loty);
		Collections.sort(posortowane);
		return posortowane;
	}

}
