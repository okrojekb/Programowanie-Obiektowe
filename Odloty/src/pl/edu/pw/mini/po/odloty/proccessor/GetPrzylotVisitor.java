package pl.edu.pw.mini.po.odloty.proccessor;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.po.odloty.loty.LotVisitor;
import pl.edu.pw.mini.po.odloty.loty.Przylot;
import pl.edu.pw.mini.po.odloty.loty.Lot;

public class GetPrzylotVisitor implements LotVisitor {

	private List<Lot> oczekiwane = new ArrayList<>();

	@Override
	public void getPrzylot(Przylot przylot) {

		if (!przylot.isCzyWyladowal()) {
			oczekiwane.add(przylot);
		}
	}

	public List<Lot> getOczekiwane() {
		return new ArrayList<Lot>(oczekiwane);
	}

}
