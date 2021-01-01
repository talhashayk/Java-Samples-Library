import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		final String[] colours = { "red", "blue", "green", "yellow", "blue", "green", "green", "yellow", "red", "red" };

		final List<String> colourList = Arrays.asList(colours);
		
		System.out.println("Colours: " + colourList);

		System.out.println("Colours without duplicates: " + removeDuplicates(colourList));

		System.out.println("Colours sorted without duplicates: " + sortRemoveDuplicates(colourList));

	}

	public static <E> Collection<E> removeDuplicates(Collection<E> c){
		return new HashSet<E>(c);
	}
	
	public static <E> Collection<E> sortRemoveDuplicates(Collection<E> c){
		return new TreeSet<E>(c);
	}

}
