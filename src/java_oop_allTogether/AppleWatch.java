package java_oop_allTogether;

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public void abstractClassInfo() { // Non-abstract method
		System.out.println(
				"Abstract class is a super class. it cannot create an object where as class can creare an object. It contain both method abstract and non abstract. Class has only nonabstract method. \n\t An interface has only abstract method where as abstract method has non-abstract method which is implemented");
	}

	public abstract void appleWatchInfo();// Abstract method

// Yes we can create the constructor inside abstract class.

	public AppleWatch() {

	}

}
