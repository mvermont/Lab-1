package pkgCore;

public class Die {

	private byte DieValue;

	public Die() {
		// TODO: Determine DieVaue.. a random number between 1 and 6
		DieValue = (byte)(Math.random()*6 + 1);			
	}

	public int getDieValue() {
		return DieValue;
	}
}
