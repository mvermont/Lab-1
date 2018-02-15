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
		if(ComeOutScore != 2 || ComeOutScore != 3 || ComeOutScore != 12 || ComeOutScore != 7 || ComeOutScore != 11) {
			while(rolls.getLast().getScore() != 7 || 
					rolls.getLast().getScore() != ComeOutScore) {
				Roll r = new Roll();
				rolls.add(r);
			}
		}	

		// TODO: value the eGameResult after the round is complete
		if(ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			eGameResult = eGameResult.CRAPS;
		}
		else if(ComeOutScore == 7 || ComeOutScore == 11) {
			eGameResult = eGameResult.NATURAL;
		}
		else if(rolls.getLast().getScore() == 7) {
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
