import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class UseInstrumentedSet {

	public static void main(String[] args) {
		useInstrumentedSet();
	}
	
	public static void useInstrumentedSet() {
		final InstrumentedSet<String> ihs = new InstrumentedSet<String>(new HashSet<String>());
		ihs.addAll(Arrays.asList("Snap","Crackle","Pop"));
		System.out.println("Added three elements to Instrumented Set (wrapper for HashSet)");
		System.out.println("InstrumentedSet size: " + ihs.size());
		System.out.println("InstrumenetedSet addCount: " + ihs.getAddCount());
		
		final InstrumentedSet<String> its = new InstrumentedSet<String>(new TreeSet<String>());
		its.addAll(Arrays.asList("Snap","Crackle","Pop"));
		System.out.println("Added three elements to Instrumented Set (wrapper for TreeSet)");
		System.out.println("InstrumentedSet size: " + its.size());
		System.out.println("InstrumenetedSet addCount: " + its.getAddCount());
		
	}
	
}
