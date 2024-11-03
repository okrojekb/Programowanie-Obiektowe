package pl.edu.pw.mini.po.terminal.bagaze;

import java.util.LinkedHashSet;
import java.util.Set;

import pl.edu.pw.mini.po.terminal.przedmioty.Kielbasa;
import pl.edu.pw.mini.po.terminal.przedmioty.Przedmiot;
import pl.edu.pw.mini.po.terminal.przedmioty.PrzedmiotLegalny;
import pl.edu.pw.mini.po.terminal.przedmioty.PrzedmiotNielegalny;

public class BagazPodreczny extends Bagaz {
	
	private Set<Przedmiot> przedmioty = new LinkedHashSet<>();


	public BagazPodreczny() {
		super();
		int iloscPrzedmiotow = 2 +random.nextInt(9);
		int los;
		for(int i =0; i<iloscPrzedmiotow; i++) {
			los = random.nextInt(3);
			switch(los) {
			case 0:
				przedmioty.add(new PrzedmiotLegalny());
				break;
			case 1:
				przedmioty.add(new PrzedmiotNielegalny());
				break;
			default:
				przedmioty.add(new Kielbasa());
			}
		}
		// TODO Auto-generated constructor stub
	}
	
	public Set<Przedmiot> pobierzPrzedmiotyZBagazu(){
		Set<Przedmiot> zwrocone = new LinkedHashSet<>();
		zwrocone.addAll(przedmioty);
		return zwrocone;
	}

}
