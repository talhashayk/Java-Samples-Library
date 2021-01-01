
public class Module implements Comparable<Module> {

	private final String prefix;
	private final int modNum;
	private final int semester;

	public Module(String pre, int i, int j) {
		this.prefix = pre;
		this.modNum = i;
		this.semester = j;
	}

	public String getPrefix() {
		return prefix;
	}

	public int getModNum() {
		return modNum;
	}

	public int getSemester() {
		return semester;
	}

	@Override
	public int compareTo(Module module) {
		final int prefixCmp = prefix.compareTo(module.prefix);
		if (prefixCmp != 0) {
			return prefixCmp;
		}
		return modNum != module.modNum ? modNum - module.modNum : semester - module.semester;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Module))
			return false;
		final Module module = (Module) obj;
		return ((prefix.equals(module.prefix)) && (modNum == module.modNum) && (semester == module.semester));
	}

	@Override
	public int hashCode() {
		int hc = 17;
		hc = 37*hc + prefix.hashCode();
		hc = 37*hc + modNum;
		hc = 37*hc + semester;
		return hc;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder(prefix);
		sb.append(modNum).append("-").append(semester);
		return sb.toString();
		//return new String(prefix + modNum + ":" + semester);
	}

}
