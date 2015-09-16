import java.util.ArrayList;
import java.util.Collections;

public class VoteProcessor {
	public VoteProcessor() {
	}

	public Object calculateElectionWinner(ArrayList<String> votes) {
		int pf = 0;
		int es = 0;
		System.out.println("Starting");
		Collections.sort(votes);// It was going to look nice... in the
								// console.... BUT "B" comes before "b"
		for (String string : votes) {
			System.out.println(string);
			if (string.equalsIgnoreCase("pope francis")) {
				pf++;
			} else if (string.equalsIgnoreCase("edward snowden")) {
				es++;
			} else {
				System.out.println("Vote for \"" + string
						+ "\" did not match any of the candidates");
			}

		}
		if (pf > es) {
			System.out.println("PF");
			return "pope francis";
		} else if (es > pf) {
			System.out.println("ES");
			return "edward snowden";
		} else if (es == pf) {
			return "TIE";
		}
		return "OOPS";

	}
}
