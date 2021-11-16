package hw8Q2UseOfSuperInChildClass;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("********This is the default constructor********");

		Daughter daughter01 = new Daughter();

		System.out.println("******Parameterized constructor initialized for daughter class*******");

		Daughter daughter02 = new Daughter("September", 45);
		System.out.println("******void type method initialized for daughter class********");

		daughter01.daughter();
		System.out.println("******parameterized method initialized for daughter class********");

		daughter01.daughterInfo("September", 45);
		System.out.println("*****default constructor initilized for father class*****");

		Father father01 = new Father();
		System.out.println("*****parameterized constructor initialized for father class*******");
		
		Father father02 = new Father("Mozammel", 71, 'M', false);
		System.out.println("****parametarized method initialized for father class*******");

	}
}