package pl.edu.pw.mini.po.terminal.bagaze;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

import pl.edu.pw.mini.po.terminal.przedmioty.PrzedmiotLegalny;

abstract public class Bagaz {
	
	protected static final Random random = new Random();
	protected static int idCounter = 1;
	protected int id;
	protected Set<PrzedmiotLegalny> przedmioty;

	public Bagaz() {
		id = idCounter;
		idCounter++;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bagaz other = (Bagaz) obj;
		return id == other.id;
	}

	public Set<PrzedmiotLegalny> getPrzedmioty() {
		return przedmioty;
	}

	
	

}
