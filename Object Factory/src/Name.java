import java.util.HashMap;
import java.util.Map;

public final class Name {

	private final String forename;
	private final String surname;

	private static final Map<String, Name> NAMES = new HashMap<String, Name>();

	public Name(String forename, String surname) {
		this.forename = forename;
		this.surname = surname;
	}

	public static Name getInstance(String forename, String surname) {
		final String k = forename + surname;
		if (!NAMES.containsKey(k)) {
			NAMES.put(k, new Name(forename, surname));
		}
		return NAMES.get(k);
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public static void main(String[] args) {
		Name t = getInstance("Talha", "Sheikh");
		Name t2 = getInstance("Zahid", "Sheikh");
		System.out.println(t);
		System.out.println(t2);
	}

	public String toString() {
		return new String(this.forename + " " + this.surname);
	}

}
