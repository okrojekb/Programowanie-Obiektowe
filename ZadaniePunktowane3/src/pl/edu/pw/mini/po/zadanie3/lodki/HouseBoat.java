package pl.edu.pw.mini.po.zadanie3.lodki;

public class HouseBoat extends LodkiZMoca {
	
	private boolean czyPoimprezowy;

	public HouseBoat(String id, String model, String port, String lokalizacja, double cena, int m, boolean c) {
		super(id, model, port, lokalizacja, cena, m);
		czyPoimprezowy = c;
	}

	@Override
	public void apply(HouseBoatsVisitor houseBoatVisitor) {
		houseBoatVisitor.visitHouseBoat(this);
	}

	public boolean isCzyPoimprezowy() {
		return czyPoimprezowy;
	}
	
	
	
	

}
