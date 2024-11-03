package pl.edu.pw.mini.po.zadanie3.parser;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import pl.edu.pw.mini.po.zadanie3.lodki.HouseBoat;
import pl.edu.pw.mini.po.zadanie3.lodki.Jacht;
import pl.edu.pw.mini.po.zadanie3.lodki.JednostkaPlywajaca;
import pl.edu.pw.mini.po.zadanie3.lodki.LodkiLokalizacja;
import pl.edu.pw.mini.po.zadanie3.lodki.Motorowka;

public class OffersParser {
	List<JednostkaPlywajaca> oferty = new LinkedList<>();

	public List<JednostkaPlywajaca> parsenonDuplicatedOffers(String nazwa) throws PowtarzajacaSieOfertaException {
		Scanner scanner = new Scanner(OffersParser.class.getResourceAsStream(nazwa));
		scanner.useDelimiter("----");

		JednostkaPlywajaca l;

		while (scanner.hasNextLine()) {
			String rodzaj = scanner.next();
			if ("Jacht".equals(rodzaj)) {
				l = parseJacht(scanner);
			} else if ("House boat".equals(rodzaj)) {
				l = parseHouseBoat(scanner);
			} else {
				l = parseMotorowka(scanner);
			}
			if (oferty.contains(l)) {
				scanner.close();
				throw new PowtarzajacaSieOfertaException();
				
				//TODO
			}
			oferty.add(l);
			scanner.nextLine();
		}

		scanner.close();

		return oferty;
	}

	private Jacht parseJacht(Scanner scanner) {
		String id = scanner.next();
		String model = scanner.next();
		String port = scanner.next();
		String lokalizacja = scanner.next();
		double cena = scanner.nextDouble();
		int przedplata = scanner.nextInt();
		Jacht j = new Jacht(id, model, port, lokalizacja, cena, przedplata);
		return j;
	}

	private HouseBoat parseHouseBoat(Scanner scanner) {
		String id = scanner.next();
		String model = scanner.next();
		String port = scanner.next();
		String lokalizacja = scanner.next();
		double cena = scanner.nextDouble();
		int mocSilnikow = scanner.nextInt();
		//boolean czyPoimprezowy = scanner.nextBoolean();
		boolean czyPoimprezowy = false;
		HouseBoat h = new HouseBoat(id, model, port, lokalizacja, cena, mocSilnikow, czyPoimprezowy);
		return h;
	}

	private Motorowka parseMotorowka(Scanner scanner) {
		String id = scanner.next();
		String model = scanner.next();
		String port = scanner.next();
		String lokalizacja = scanner.next();
		double cena = scanner.nextDouble();
		int mocSilnikow = scanner.nextInt();
		Motorowka m = new Motorowka(id, model, port, lokalizacja, cena, mocSilnikow);
		return m;
	}

}
