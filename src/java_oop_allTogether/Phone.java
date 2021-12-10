package java_oop_allTogether;
/*
 * 02) Create a package 'java_oop_allTogether' (The code needs to prepare according to the question): Phone is an interface that has four abstract method interfaceInfo, call, message, camera and 2 non-abstract method - battery and wireless which are implemented. from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."]. When you get a chance to implement interfaceInfo, print out answers for the following questions: [What are the features of Interface you know? Can we create a constructor inside an interface? Can we write variables inside Interface? Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods which will be implemented, also print whatever you like. Do you think we can extends or implements Interface? Single or multiple? Create two interface Pager and Wakitaki (Phone interface inherit them) and One regular class name LandPhone and one abstract class SatelitePhone. make a relation of this 4, with Phone if possible. [points: 70] .
 */
// Here interface Phone can inherit more then one interface with extends keyword.
public interface Phone extends Pager, Wakitaki {
	public abstract void interfaceInfo();
	// we cann't implement an abstract method in the interface 

	public abstract void call();

	public abstract void message();

	public abstract void camera();

//	public default void battery() { 
//		System.out.println("Default method implemented");
//
//	}
//
//	public static void wireless() {
//		System.out.println("Static method implemented");
//
//	}
	// question didn't ask the default or static method and we cannot create a non abstract method inside a interface

	public default void printInfo() {
		System.out.println("batter is a default method in the interface class in java");
		System.out.println("wireless is a static method in the infteface class in the java");
		System.out.println("\n\tThe interface is a blue print of class.\nit can't instantiated. \n\tInterface has a collection of method.it has only abstract method. \nAbstract method can only declared not implimented.");
	}

	// We can't create the non abstract method battery and wireless method in the
	// interface.
	// InterfaceInfo cannot implement in the interface class because interface class
	// contains only abstract method.
}
// No we can't create the constructor inside the interface class.
// we can only extends interface using extends keywords.
