import java.util.HashMap;

public class HashMapCalculator {

	public Object commonKeyValuePairs(HashMap<String, String> hashmap1,
			HashMap<String, String> hashmap2) {
		int i = 0;
		for (String name : hashmap1.keySet()) {
			System.out.println(name + ": " + hashmap1.get(name) + " "
					+ hashmap2.get(name));
			if (hashmap1.get(name) == hashmap2.get(name)) {
				i++;
			}
		}
		return i;
	}

}
