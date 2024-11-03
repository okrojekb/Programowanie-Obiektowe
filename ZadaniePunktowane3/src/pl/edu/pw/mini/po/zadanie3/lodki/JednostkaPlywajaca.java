package pl.edu.pw.mini.po.zadanie3.lodki;

import java.util.Objects;

public class JednostkaPlywajaca {
	
	protected String id;
	protected String model;
	protected String port;
	protected LodkiLokalizacja lokalizacja;
	protected double cena;
	public JednostkaPlywajaca(String id, String model, String port, String lokalizacja, double cena) {
		this.id = id;
		this.model = model;
		this.port = port;
		this.lokalizacja = new LodkiLokalizacja(lokalizacja);
		this.cena = cena;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JednostkaPlywajaca other = (JednostkaPlywajaca) obj;
		return Objects.equals(id, other.id);
	}
	
	public void apply(HouseBoatsVisitor houseBoatVisitor) {}
	
	

}
