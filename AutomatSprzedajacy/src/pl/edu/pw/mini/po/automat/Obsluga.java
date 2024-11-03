package pl.edu.pw.mini.po.automat;

import java.util.List;

import pl.edu.pw.mini.po.automat.produkty.Napoj;
import pl.edu.pw.mini.po.automat.produkty.ProduktSpozywczy;
import pl.edu.pw.mini.po.automat.produkty.ProduktSpozywczyZMasa;

public interface Obsluga {

	public void randomOrder();

	public List<ProduktSpozywczy> getAll();

	public boolean put(ProduktSpozywczyZMasa przekaska) throws ZawartoscCukruPozaPrzedzialemException;

	public boolean putDrink(Napoj napoj) throws ZawartoscCukruPozaPrzedzialemException;

}
