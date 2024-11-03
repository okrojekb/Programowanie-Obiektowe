package pl.edu.pw.mini.po.terminal.przedmioty;

public class Kielbasa extends PrzedmiotNielegalny {

	public Kielbasa() {
		masa = wylosujIntZZakresu(1,2);
		stopienNielegalnosci = masa*5;
	}

}
