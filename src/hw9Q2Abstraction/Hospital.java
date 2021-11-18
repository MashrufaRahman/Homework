package hw9Q2Abstraction;

public interface Hospital {
	public void emergencyRoom();

	public void surgeryRoom();

	public void cateteria();
	
	//default method created
	public default void morque() {
		System.out.println("morque method from Hospital Interface");
	}
	
	// Static method created
	public static void pharmacy() {
		System.out.println("This is the static method from Hospital Interfac");
		
	}
	
}
   