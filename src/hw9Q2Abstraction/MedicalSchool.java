 
package hw9Q2Abstraction;

public abstract class MedicalSchool extends NursingSchool implements LawSchool{

	// Non abstract method
	public void anatomyLab() {
		System.out.println("This is my favorite anatomylab");
	}

	// Abstract method
	public abstract void biochemistryLab();{
		System.out.println("biochemistryLab method from MedicalSchool abstract class");
	}

}
