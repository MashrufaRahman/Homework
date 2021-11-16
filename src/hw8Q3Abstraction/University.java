package hw8Q3Abstraction;

import hw7Q3Abstraction.College;
import hw7Q3Abstraction.Hospital;

public interface University extends College, Hospital {

	public void classSize();

	public void playGround();

	public void teacher();
	
	// Default method
   public default void gymnasium() {
	   
   }
   
   // Static method
	public static void library() {
	   System.out.println("This is the Static method");
		
		
	}
	

}
