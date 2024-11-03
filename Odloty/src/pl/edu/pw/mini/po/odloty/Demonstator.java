package pl.edu.pw.mini.po.odloty;

import java.util.List;

import pl.edu.pw.mini.po.odloty.loty.Lot;
import pl.edu.pw.mini.po.odloty.loty.ZlyZakresStoiskCheckInException;
import pl.edu.pw.mini.po.odloty.parser.FlightsParser;
import pl.edu.pw.mini.po.odloty.proccessor.FlightsProcessor;


public class Demonstator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightsParser fp = new FlightsParser();
		try {
			List<Lot> parsedFlights = fp.parseFlights("/loty.txt");
			//System.out.println(FlightsParser.class.getResourceAsStream("/loty.txt"));

			FlightsProcessor flightsProcessor = new FlightsProcessor(parsedFlights);

			flightsProcessor.getExpectedArrivals();
			flightsProcessor.getFlightsOrdered();

			//fp.parseFlights("/loty_bad.txt");

		} catch (ZlyZakresStoiskCheckInException e) {
			e.printStackTrace();
		}

	}

}
