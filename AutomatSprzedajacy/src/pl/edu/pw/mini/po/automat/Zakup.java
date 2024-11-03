package pl.edu.pw.mini.po.automat;

import java.util.List;

import pl.edu.pw.mini.po.automat.produkty.ProduktSpozywczy;

public interface Zakup {
	
	public void randomOrder();

	public List<ProduktSpozywczy> getAll();

}
