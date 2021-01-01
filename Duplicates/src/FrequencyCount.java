import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCount {

	public static void main(String[] args) {
		String input = "the cat sat on the fatter cat";
		String[] words = input.split(" ");
		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String s : words) {
			Integer frequency = m.get(s);
			if (frequency == null) {
				m.put(s, 1);
			} else {
				m.put(s, (frequency + 1));
			}
		}

		System.out.println(m.size() + " distinct words detected.");
		System.out.println(m);

		Map<String, Integer> sortedM = new TreeMap<String, Integer>(m);
		System.out.println("Sorted:");
		System.out.println(sortedM);

	}

}
