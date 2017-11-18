
public class AllaTalBlir5_2 {
	/*
	 * 1. ruta där man skriver in ett tal. 2. display på hela beräkningen. 3.
	 * "Skriv in en till siffra". 4. display hela beräkningen. 5.
	 * "COOOOOOOOLT!!! Svaret blir alltid 5!!!!!"
	 */
	

	private int tal = 0;
	private int two = 2; 
	private int ten = 10;

	public int getTal() {
		return tal;
	}

	public void setTal(int tal) {
		this.tal = tal;
	}

	public int mult2(int tal, int two) {
		int result = tal * two;
		return result;
	}

	public int plus10(int mult2, int ten) {
		int result = mult2 + ten;
		return result;
	}

	public int div2(int plus10, int two) {
		int result = plus10 / two;
		return result;
	}

	public int resultat(int div2, int tal) {
		int result = div2 - tal;
		return result;
	}
	
	//detta är en sekvens som jag inte förstår hur jag skall formulera...
	public String toString() {
		
		int mult2;
		String visning = "\n" + this.getTal() + " * 2 = " + this.mult2(tal, two) + "\n" + this.mult2(tal, two) + " + 10 = " + this.plus10(mult2, ten) + "\n" + plus10()
				+ " / 2 = " + div2() + "\n" + div2() + " - " + tal + " = " + resultat();
		return visning.toString();
	}

}
