package pl.edu.pw.mini.po.Pralnia.pralnia;

import java.util.List;
import java.util.Set;

import pl.edu.pw.mini.po.Pralnia.kieszen.ElementKieszeni;
import pl.edu.pw.mini.po.Pralnia.ubrania.ElementGarderoby;

public interface ObslugaPralni{

	public void putToWash(ElementGarderoby el);

	public void washAll() throws OdbezpieczonyGranatException;

	public Set<ElementGarderoby> pickUpWashedClothes();

	public Set<ElementKieszeni> getPocketStuffByClothes(ElementGarderoby el);

}
