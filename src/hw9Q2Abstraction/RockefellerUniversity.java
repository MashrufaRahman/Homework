package hw9Q2Abstraction;

public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool {
	public static void main(String[] args) {

	}

	// public abstract void maths();
	// Inside the class contains only non abstract methods

	public void statistics() {
		System.out.println("This is non abstract or implemented method");
	}

	// Default constructor
	public RockefellerUniversity() { 

	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("AeronauticalInfo method From AeronauticalSchool Interface");
	}

	@Override
	public void computerLab() {
		System.out.println("ComputerLab method From EngineeringSchool abstract class");
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}


}
