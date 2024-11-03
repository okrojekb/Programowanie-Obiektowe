package pl.edu.pw.mini.po.odloty.loty;

import java.util.Scanner;

import pl.edu.pw.mini.po.odloty.parser.FlightsParser;

public class WylotZakresCheckIn {
	
	private int nrStoiskOd;
	private int nrStoiskDo;

	public WylotZakresCheckIn(String z) throws ZlyZakresStoiskCheckInException{
		Scanner scanner = new Scanner(z);
		scanner.useDelimiter("-");
		int o = Integer.valueOf(scanner.next());
		int d = Integer.valueOf(scanner.next());
		if(o>d) {
			throw new ZlyZakresStoiskCheckInException(o, d);
		}
		

	}
	
	

}
