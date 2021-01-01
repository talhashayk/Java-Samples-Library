
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterators {

	public static void main(String[] args) {
		List<String> students = new LinkedList<String>();
		students.add("Talha Sheikh");
		students.add("Moeez Shahid");
		students.add("Arman Jalilian");
		students.add("Robin Moffat");
		
		ListIterator<String> iterator = students.listIterator();	
		iterator.next();
		iterator.add("Husain Chopdawala"); // Will add name between Talha and Moeez
		iterator.add("Shawak Sharma"); // Will add name between Husain and Moeez
		iterator.next();
		iterator.remove(); // Will remove last traversed element
		
		iterator = students.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
