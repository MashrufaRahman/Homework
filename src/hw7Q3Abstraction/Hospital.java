package hw7Q3Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cateteria();
	
	//default method created
	public default void morque() {
		
	}
	
	// Static method created
	public static void pharmacy() {
		
	}
	
}
   