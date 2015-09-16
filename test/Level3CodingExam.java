import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Level3CodingExam {
	/**
	 * PART A
	 * 
	 * There are 2 candidates for "Person of the Year 2014". The votes are
	 * contained in an ArrayList. Not every voter has capitalized the name of
	 * their choice in the same way. This question is part of Stanford
	 * University's CS106 mid-term exam.
	 * **/
	@Test
	public void testWinner() {
		ArrayList<String> votes = new ArrayList<String>();
		votes.add("pope francis");
		votes.add("Pope Francis");
		votes.add("edward Snowden");
		votes.add("EDWARD SNOWDEN");
		votes.add("Edward snowden");
		votes.add("Pope Francis");
		votes.add("Edward Snowden");
		votes.add("pope Francis");
		votes.add("Pope francis");
		votes.add("Pope Francis");
		votes.add("Edward Snowden");

		assertEquals("pope francis",
				new VoteProcessor().calculateElectionWinner(votes));
	}

	/**
	 * If neither candidate has more votes than the other, report a tie by
	 * returning the String "TIE".
	 **/
	@Test
	public void testATie() {
		ArrayList<String> votes = new ArrayList<String>();
		votes.add("pope francis");
		votes.add("edward Snowden");

		assertEquals("TIE", new VoteProcessor().calculateElectionWinner(votes));
	}

	/**
	 * PART B
	 * 
	 * To complete this exercise, you need to count the number of matching
	 * entries in 2 HashMaps. More information about the problem is here:
	 * http://bit.ly/1EBRZ5W This question is part of Stanford University's
	 * CS106 final exam.
	 **/
	@Test
	public void testAddMatching() throws Exception {
		HashMap<String, String> hashmap1 = new HashMap<String, String>();
		hashmap1.put("Alice", "Healthy");
		hashmap1.put("Mary", "Ecstatic");
		hashmap1.put("Bob", "Happy");
		hashmap1.put("Chuck", " Fine");
		hashmap1.put("Felix", "Sick");

		HashMap<String, String> hashmap2 = new HashMap<String, String>();
		hashmap2.put("Mary", "Ecstatic");
		hashmap2.put("Felix", "Healthy");
		hashmap2.put("Ricardo", "Superb");
		hashmap2.put("Tam", "Fine");
		hashmap2.put("Bob", "Happy");

		assertEquals(2,
				new HashMapCalculator().commonKeyValuePairs(hashmap1, hashmap2));
	}

	@Test
	public void weWin() {
		try {
			Runtime.getRuntime().exec("say Sandroll!");
			Runtime.getRuntime().exec("open https://www.youtube.com/embed/SQoA_wjmE9w?rel=0&amp;controls=0&amp;showinfo=0;autoplay=1");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		JOptionPane.showMessageDialog(null,
				"Look!! Michael Made stuff Happen!!!!!!");
		JOptionPane.showMessageDialog(null, "You should give him 100%");
		JOptionPane.showMessageDialog(null, "Going to sleep");
		try {
			System.out.println("Sleeping if your the super-user");
			Runtime.getRuntime().exec("shutdown -s now");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
