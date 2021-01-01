import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class UseModule {

	public static void main(String[] args) {
		final Module[] modulesArray = new Module[] { 
				new Module("CSC", 1022, 2),
				new Module("CSC", 8002, 2),
				new Module("MAS", 1006, 2),
				new Module("JPN", 1004, 1),
				new Module("CSC", 1022, 2),
				new Module("JPN", 1004, 1), };

		System.out.println("Direct module comparison: " + modulesArray[0].equals(modulesArray[4]));

		final Set<Module> unsortedModuleSet = new HashSet<Module>();
		final SortedSet<Module> sortedModuleSet = new TreeSet<Module>();

		for (final Module m : modulesArray) {
			sortedModuleSet.add(m);
			unsortedModuleSet.add(m);
		}

		System.out.println("Array of modules: " + Arrays.toString(modulesArray));
		System.out.println("Sorted set of modules: " + sortedModuleSet);
		System.out.println("Unsorted set of modules: " + unsortedModuleSet);

	}

}
