package hw9Q2Abstraction;

public abstract class NursingSchool extends RockefellerUniversity {

	// Non abstract method
	public void hygiene() {
		System.out.println("This is my favorite mechanicalLab");
	}

	// Abstract method
	public abstract void caring();

	// Constructor created
	public NursingSchool() {

	}
}
