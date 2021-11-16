package hw8Q3Abstraction;

public abstract class MedicalSchool extends NursingSchool{

	// Non abstract method
	public void anatomyLab() {
		System.out.println("This is my favorite anatomylab");
	}

	// Abstract method
	public abstract void biochemistryLab();

}
