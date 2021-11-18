package hw9Q2Abstraction;

import hw7Q3Abstraction.College;
import hw7Q3Abstraction.Hospital;

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();
	
	// Default method
   public default void gymnasium() {
	   System.out.println("gymnasium method from University Interface  ");
	   
   }
   
   // Static method
	public static void library() {
	   System.out.println("This is the Static method from University interface");
	}
	
	public static void pharmacy() {
		System.out.println("This is the static method from Hospital Interfac");
		
	}
}
