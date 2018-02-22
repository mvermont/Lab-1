package pkgTest;

import pkgCore.Round;

public class RoundTest {
	
	public static void main(String[] args) {
		Round r = new Round();
		
		System.out.println(r.getResult() + " in " + r.RollCount() + " rolls.");
		r.printRolls();
	
	}

}
