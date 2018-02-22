package pkgTest;

import pkgCore.Round;

public class RoundTest {
	
	public static void main(String[] args) {
		Round r = new Round();
		
		System.out.print(r.getResult() + " in " + r.RollCount() + " rolls.");
		r.printRolls();
	
	}

}
