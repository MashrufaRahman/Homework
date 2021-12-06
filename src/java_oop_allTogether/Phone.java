package java_oop_allTogether;

// Here interface Phone can inherit more then one interface with extends keyword.
public interface Phone extends Pager, Wakitaki {
	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {

	}

	public static void wireles() {

	}

	public static void main(String[] args) {
		System.out.println("batter is a default method in the interface class in java");
		System.out.println("wireless is a static method in the infteface class in the java");
		System.out.println(
				"\n\tThe interface is a blue print of class.\nit can't instantiated. \n\tInterface has a collection of method.it has only abstract method. \nAbstract method can only declared not implimented.");
	}

	// We can't create the non abstract method battery and wireless method in the
	// interface.
	// InterfaceInfo cannot implement in the interface class because interface class
	// contains only abstract method.
}
// No we can't create the constructor inside the interface class.
// we can only extends interface using extends keywords.
