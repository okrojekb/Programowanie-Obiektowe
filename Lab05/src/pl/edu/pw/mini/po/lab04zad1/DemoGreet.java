package pl.edu.pw.mini.po.lab04zad1;

public class DemoGreet 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Greetings person1 = new Greetings("Adam");
		for (int i=0; i<13; i++) 
		{
			person1.greet();
		}
		Greetings person2 = new Greetings("Eve");
		person2.greet();
		
		//System.out.println("ownCounter1 = " + person1.getOwnCounter() + "\nownCounter2 = " + person2.getOwnCounter());
		
		//System.out.println("name1 = " + person1.getName() + "\nname2 = " + person2.getName());
		//System.out.println("Static allCounter = " + person2.allCounter);
		
		for (int i=0; i<13; i++) 
		{
			person2.greet();
			//System.out.println("Static allCounter = " + person2.allCounter);
		}

	}

}
