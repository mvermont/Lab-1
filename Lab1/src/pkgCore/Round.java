package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
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
			}
		}	

		// TODO: value the eGameResult after the round is complete
		if(r1.isCraps()) {
			eGameResult = eGameResult.CRAPS;
		}
		else if(r1.isNatural()) {
			eGameResult = eGameResult.NATURAL;
		}
		else if(rolls.getLast().isSeven()) {
			eGameResult = eGameResult.SEVEN_OUT;
		}
		else if(rolls.getLast().getScore() == ComeOutScore) {
			eGameResult = eGameResult.POINT;
		}
		else {
			Round r2 = new Round();
		}
	}

	public int RollCount() {
		// Return the roll count
		int count = 0;
		LinkedList<Roll> round1copy = new LinkedList<Roll>();
		while(rolls.getLast() != null) {
			round1copy.add(rolls.remove());
			count += 1;
		}
		return count;
	}
}
