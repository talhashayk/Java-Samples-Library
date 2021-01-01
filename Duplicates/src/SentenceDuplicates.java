import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SentenceDuplicates {

	public static void main(String[] args) {
		String input = "the cat sat on the fatter cat";
		String[] words = input.split(" ");

		Set<String> uniques = new HashSet<String>();
		Set<String> duplicates = new TreeSet<String>();
	
		for (String s: words) {
			if(!uniques.add(s)) { // If not already present within set; returns true
				duplicates.add(s);
			}
		}
		
		uniques.removeAll(duplicates);
		
		System.out.println("Unique words: " + uniques);
		System.out.println("Duplicates: " + duplicates);
		
	}

}
