import java.util.Map;
import java.util.HashMap;

public class UsingMaps {

	public static void main(String[] args) {
		Map<String,String> thomas = new HashMap<String,String>();
		thomas.put( "name", "Thomas" );
		thomas.put( "colour", "blue" );
		thomas.put( "engine", "diesel" );
		thomas.put( "type", "EMD F3" );
		thomas.put( "role", "trainee" );
		
		System.out.println(thomas);
		
		System.out.println();
		
		System.out.println(thomas.get("colour"));
		
		System.out.println();
		
		System.out.println("Keys:");
		for(String s: thomas.keySet()) {
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println(thomas.size());
		
		System.out.println();
		
		System.out.println("Values:");
		for(String s: thomas.values()) {
			System.out.println(s);
		}

	}

}
