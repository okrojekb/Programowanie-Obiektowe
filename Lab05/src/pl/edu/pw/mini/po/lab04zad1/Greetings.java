package pl.edu.pw.mini.po.lab04zad1;

public class Greetings {
	
	private int ownCounter;
	private String name;
	static int allCounter = 0;
	
	public Greetings(String nm)
	{
		name = nm;
	}
	
	
	public void greet()
	{
		if (allCounter > 20) 
		{
			System.out.println("I've already been used 20 times.");
		}
		else if (ownCounter > 10)
		{
			System.out.println("I've already greeted you 10 times.");
		}
		else
		{
			System.out.println("Hey, " + name);
			ownCounter++;
			allCounter++;
		}
	}

}
