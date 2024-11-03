package pl.edu.pw.mini.po.odloty.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pl.edu.pw.mini.po.odloty.loty.Lot;
import pl.edu.pw.mini.po.odloty.loty.Przylot;
import pl.edu.pw.mini.po.odloty.loty.Wylot;
import pl.edu.pw.mini.po.odloty.loty.WylotStatus;
import pl.edu.pw.mini.po.odloty.loty.WylotZakresCheckIn;
import pl.edu.pw.mini.po.odloty.loty.ZlyZakresStoiskCheckInException;

public class FlightsParser {

	public List<Lot> parseFlights(String nazwa) throws ZlyZakresStoiskCheckInException {
		List<Lot> loty = new ArrayList<>();

		Scanner scanner = new Scanner(FlightsParser.class.getResourceAsStream(nazwa));
		scanner.useDelimiter("###");

		while (scanner.hasNextLine()) {
			String typLotu = scanner.next();
			if ("O".equals(typLotu)) {
				loty.add(stworzWylot(scanner));
			} else {
				loty.add(stworzPrzylot(scanner));
			}
			scanner.nextLine();
		}
		scanner.close();
		return loty;
	}

	private Wylot stworzWylot(Scanner scanner) throws ZlyZakresStoiskCheckInException {
		String g = scanner.next();
		String d = scanner.next();
		String i = scanner.next();
		String l = scanner.next();
		WylotStatus s = WylotStatus.valueOf(scanner.next().toUpperCase());
		WylotZakresCheckIn c = new WylotZakresCheckIn(scanner.next());
		Wylot w = new Wylot(g, d, i, l, s, c);
		return w;
	}

	private Przylot stworzPrzylot(Scanner scanner) {
		String g = scanner.next();
		String s = scanner.next();
		String i = scanner.next();
		String l = scanner.next();
		boolean c = scanner.nextBoolean();
		int w = scanner.nextInt();
		Przylot p = new Przylot(g, s, i, l, c, w);
		return p;
	}

}
