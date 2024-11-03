package pl.edu.pw.mini.po.Bozena;

public class PrzeciwczolgowaMina extends Mina {

	private static final double minMasaMaterialuWybuchowego = 1.5;
	private static final double maxMasaMaterialuWybuchowego = 2.5;


	private double masaMaterialuWybuchowego;

	public PrzeciwczolgowaMina() {
		super();

	}

	@Override
	protected void ustawEkologiczna() {
		ekologiczna = false;
	}

	private void ustawMasaMaterialuWybuchowego() {
		masaMaterialuWybuchowego = minMasaMaterialuWybuchowego
				+ random.nextDouble() * (maxMasaMaterialuWybuchowego - minMasaMaterialuWybuchowego);
	}
	
	public String toString() {
		String str = "X";
		return str;
	}
	
	public void pressMe() {
		if(czy_uzbrojona == true) {
			System.out.println("Kaboom!!!");
		}else {
			System.out.println("Chrup");
		}
	}

}
