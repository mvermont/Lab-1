package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private byte Score;

	public Roll() {
		// TODO: Create an instance of d1 and d2...
		// TODO: Determine 'Score'
		d1 = new Die();
		d2 = new Die();
		Score = (byte) (d1.getDieValue() + d2.getDieValue());
	}

	public byte getScore() {
		return Score;
	}
	
	public boolean isSeven() {
		return Score == 7;
	}
	public boolean isEleven() {
		return Score == 11;
	}
	public boolean isNatural() {
		return isSeven() || isEleven();
	}
	
	public boolean isTwo() {
		return Score == 2;
	}
	public boolean isThree() {
		return Score == 3;
	}
	public boolean isTwelve() {
		return Score == 12;
	}
	public boolean isCraps() {
		return isTwo() || isThree() || isTwelve();
	}
}
