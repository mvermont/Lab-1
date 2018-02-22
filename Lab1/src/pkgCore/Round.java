package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private String result;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore
		Roll r1 = new Roll();
		ComeOutScore = r1.getScore();
		rolls.add(r1);

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		if(r1.isCraps() == false && r1.isNatural() == false) {
			while(rolls.getLast().isSeven() == false || 
					rolls.getLast().getScore() != ComeOutScore) {
				Roll r = new Roll();
				rolls.add(r);
				System.out.print(r.getScore());
				
			}
		}	

		// TODO: value the eGameResult after the round is complete
		if(r1.isCraps()) {
			eGameResult = eGameResult.CRAPS;
			result = "Craps";
		}
		else if(r1.isNatural()) {
			eGameResult = eGameResult.NATURAL;
			result = "Natural";
		}
		else if(rolls.getLast().isSeven()) {
			eGameResult = eGameResult.SEVEN_OUT;
			result = "Seven out";
		}
		else if(rolls.getLast().getScore() == ComeOutScore) {
			eGameResult = eGameResult.POINT;
			result = "Point";
		}
		else {
			Round r2 = new Round();
		}
	}
	
	public void printRolls() {
		int count = 0;
		System.out.println("Rolls: ");
		while(count < RollCount()) {
			System.out.print(rolls.get(count).getScore());
			count++;
		}
	}
	public String getResult() {
		return result;
	}

	public int RollCount() {
		// Return the roll count
		int count = 0;
		for(int i = 0; i < rolls.size(); i++) {
			count += 1;
		}
		return count;
	}
}
