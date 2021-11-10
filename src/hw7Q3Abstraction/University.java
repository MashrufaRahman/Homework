package hw7Q3Abstraction;

public interface University {

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
