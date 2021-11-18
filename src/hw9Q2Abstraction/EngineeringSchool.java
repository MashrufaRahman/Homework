package hw9Q2Abstraction;

public abstract class EngineeringSchool extends NYUniversity{

	// Non abstract method
	public void mechanicalLab() {
		System.out.println("This is my favorite mechanicalLab");
	}

	// Abstract method
	public abstract void computerLab();

}
